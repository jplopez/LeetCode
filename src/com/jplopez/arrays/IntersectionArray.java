package com.jplopez.arrays;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import static java.util.Comparator.*;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IntersectionArray {

  public int[] intersect(int[] nums1, int[] nums2) {

    Arrays.sort(nums1);
    Arrays.sort(nums2);

    List<Integer> base = new AbstractList<Integer>() {
      

      ArrayList<Integer> wrap=new ArrayList<Integer>(Arrays.stream(nums1).boxed().toList());
      ArrayList<Integer> intersect=new ArrayList<Integer>(nums1.length+nums2.length);
      
      int lastIndex=-1;
      
      @Override
      public boolean add(Integer e) {
        if(lastIndex>=0 && lastIndex<wrap.size()-1) {
          lastIndex++;
          if(wrap.get(lastIndex).equals(e)) return intersect.add(e);
        }
        if(!intersect.contains(e)) {
          lastIndex=wrap.indexOf(e);
          if(lastIndex>=0) return intersect.add(e);
        }
        lastIndex=-1;
        return false;         
      }

      @Override
      public boolean addAll(Collection<? extends Integer> c){
        c.stream().forEach(this::add);
        return !intersect.isEmpty();
      }

      @Override
      public int size(){return intersect.size();}
      @Override
      public Iterator<Integer> iterator(){return intersect.iterator();}
      @Override
      public Object[] toArray(){return intersect.toArray();}      
      @Override
      public Stream<Integer> stream(){return intersect.stream();}
      @Override
      public Integer get(int index){return intersect.get(index);} 
    };
    Arrays.stream(nums2).forEach(base::add);
    return base.stream().mapToInt(Integer::intValue).toArray();
  }

}
