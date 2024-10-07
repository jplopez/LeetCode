## LeetCode Study

This repo has all the LeetCode material I've studied, and will be updated, everytime I solve another problem.
My code style is a mix of TDD and XP, that I learned about 10 years ago, and has serve me well ever since. 

This repo serves me as a consulting material for when I have similar problems in production code, or when I want to show or explain things to colleagues.
I also expect others to find my solutions useful and inspiring. Even if you consider my code the 'wrong' way of doing things.

## Folder Structure

The workspace contains two main folders 'src' and 'test, where:

- `src`: maintains code source of LeetCode problems I've solved (or tried to)
- `test`: maintains code sources for the test (junit) to solve the problems using TDD.

For every class in 'src' you'see a class in 'test' with the same name, but ending in 'Test'.

## Problem Solving Approach

For each step below, I try to remember to push a commit, that way I have a history of my thinking.

1. I copy the problem statement as a comment into the Test class. This saves me time switching back and forth, and to work on the go, if there's no internet
2. Start creating Unit test for all the scenarios I can identify. This typically includes edge cases (null, empty arrays, etc.) and one unit test for each example case in the LeetCode page.
3. In the solution class, I copy the method signatures from LeetCode, adding a default return if needed, for the sake of compilation.
4. I start writting the tests. This means:
   1. Create the variables/objects with the test data
   2. The call to the solution function
   3. The asserts to validate the solution.
5. I then run the test suite, which obviously shows all tests failing. I'm doing this to make sure they will run, once I start coding the solution.
6. Start coding the solution

## My Coding Approach

Here are pointers at how I approach the problem solving coding part. Is the mindset that best works for me. 

1. Validations and edge cases at the top of the method. I like to fail fast and just finish the execution, as opposed to enclose the entire code in a giant if.
2. For LeetCode problemas, I like solving one case at a time, usually starting with the most straight forward use case I can think of.
3. My first passes do not produce clean and efficient code, they're intended to get out of my head all my thoughts. This is how I avoid perfectionism getting in the way.
4. Run the test. Always after a couple of changes, I run the test. Even if I know it will fall, the assert's message help me detect if my code is doing what is supposed to do.
   * Note: sometimes I add temporarily asserts to the test, if I need to test and intermediate state. I need to remember to remove them later. 
5. If after a couple of iterations, I can't get the results I'm expecting, then is debugging time.
6. I follow my code step-by-step, analysing variables, values, state of objects, etc.
   * Debugging is time and energy consuming. Is also the most effective way I've found to detect my code flaws.
7. Once a use case is done, I have two options: 1) clean/optimize the code, 2) move to the next use case and repeat the steps. The answer depends in the context:
   * For production code, I always move to 1.
   * For LeetCode, depends on my levels or energy and available time. This is my study repo, not an academical essay.

## Keep it Fresh and Interesting

I noticed that after several days of LeetCode, I feel burned out, making it hard to find the motivation to keep going. I've found that adding some additional challenges, help me stay interested. Some the things I've done are:
1. Use only the core language functions. In Java would be solving the problem without using any 'imports' in the class.
2. If you're familiarized with the problem, and already know a solution. Force yourself to use another. For example, switch from iteration to recurrency, or vice versa. Extend Java classes, or make your own implementation of Interfaces, instead of just coding the logic within the solution method.
   * I often create custom implementation of Lists/Collections, Comparators or Iterators, that modify the natural behaviors for int or String.  
   
