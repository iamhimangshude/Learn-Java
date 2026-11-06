import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class DeterministicFiniteAutomata {
    public static void main(String[] args) {

        // building for automaton string that ends with 0(zero). You can customize it as per requirements...
        Map<Character, List<List<Character>>> transitionFnAsMap = new HashMap<>();
        transitionFnAsMap.put('A', new ArrayList<>(Arrays.asList(Arrays.asList('0', 'B'), Arrays.asList('1', 'A'))));
        transitionFnAsMap.put('B', Arrays.asList(Arrays.asList('0', 'B'), Arrays.asList('1', 'A')));

        List<Character> statesSet = Arrays.asList('A', 'B');
        List<Character> symbolsSet = Arrays.asList('0', '1');

        char initialState = 'A';
        char finalState = 'B';
        String str = "011010101010100111000000011110010110010011010100";

        // checking the running time, yes the time! I have an itch in my mind! Sorry!
        long startTime = System.nanoTime();
        
        System.out.println(automaton(statesSet, symbolsSet, transitionFnAsMap, initialState, finalState, str)); // 1 -> Accepted , -1 -> Not Accepted

        // ending time
        long endTime = System.nanoTime();
        double durationInMilliSex = (endTime - startTime)  /  1_000_000.0;
        System.out.println("Time taken: " + durationInMilliSex + "ms"); // returning the running time!
    }

    public static int automaton(List<Character> setOfStates, List<Character> setOfSymbols,
            Map<Character, List<List<Character>>> transitionFnAsTable,
            Character initialState, Character finalState, String string) {
        Character curState = initialState;

        if (!setOfStates.contains(initialState)){
            throw new IllegalArgumentException("initialState is not in set of states!");
        }

        int i = 0;
        while (i < string.length()) {
            Character parsedInputStr = string.charAt(i); // 0 at ith position
            
            List<List<Character>> values = transitionFnAsTable.get(curState);

            for (List<Character> value: values){
                Character inputStr = value.get(0); // 0
                if (parsedInputStr.compareTo(inputStr) == 0){ // enters the condition blk
                    curState = value.get(1); // state chg occurs A->B
                    break; // breaks the loop
                }
            }
            i++;
        }

        return finalState.compareTo(curState) == 0 ? 1 : -1;
    }
}

// Objective:

// to have a functional DFA (Deterministic Finite Automata) concept from Theory
// of Computation applied using java program.

// Process:
// 1. accept all the required elements from the user...
// --- Q: finite non-empty set of states
// --- Sigma: finite non-empty set of finite input alphabets
// --- delta: transition function (delta: Q * Sigma -> Q)
// --- q0: initial state (must belong to Q)
// --- F: set of final states (must belong to Q)

// 2. For delta:
// -- we should use hashmap, we should take up a set of inputs as map

// 3. For sigma and Q:
// -- we should use Sets or Array (it can be primitive)

// 4. For language validation:
// -- language should be taken from the a provided data!

// 5. Working:
// -- 1. take a string from the language set.
// -- 2. parse a substring from the string
// -- 3. put that substring in the DFA
// ------ 3.1. In the DFA, the string is validated using inputs in the
// transition table
// ------ 3.2. The states are also updated with the transition
// ------ 3.3. The achieved final state is compared with the one provided as
// argument during the function call!
// -- 4. perform 1 - 3 in a loop of n times, where n is the length of string
// -- 5. we maintain two arrays: elements that are valid (accepted by DFA) and
// elements that are invalid (not accepted by DFA).

// 6. FLAGS: 1 - Accepted; -1 -> Not Accepted