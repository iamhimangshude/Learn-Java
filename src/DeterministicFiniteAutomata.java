import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class DeterministicFiniteAutomata {
    public static void main(String[] args) {

        // building for automaton string that ends with 0(zero). You can customize it as
        // per requirements...
        Map<Character, List<List<Character>>> transitionFnAsMap = new HashMap<>();
        List<Character> statesSet = new ArrayList<>();
        List<Character> symbolsSet = new ArrayList<>();
        char initialState, finalState;

        transitionFnAsMap.put('A', new ArrayList<>(Arrays.asList(Arrays.asList('0', 'B'), Arrays.asList('1', 'A'))));
        transitionFnAsMap.put('B', Arrays.asList(Arrays.asList('0', 'B'), Arrays.asList('1', 'A')));

        Scanner scanner = new Scanner(System.in);

        // ============ State input ==========================================
        System.out.print("Enter total no. of states to be added: ");
        int totalStates = scanner.nextInt();
        scanner.nextLine(); // for clearing the input buffer!

        for (int i = 0; i < totalStates; i++) {
            System.out.print("Enter state #" + (i + 1) + ": ");
            Character inputState = scanner.nextLine().charAt(0);
            statesSet.add(inputState);
        }

        // scanner.nextLine(); // for clearing input buffer!


        // =================== Symbol input ====================================
        System.out.print("Enter total no.of Symbols: ");
        int totalSymbols = scanner.nextInt();
        scanner.nextLine(); // for clearing the input buffer!

        for (int i = 0; i < totalSymbols; i++) {
            System.out.print("Enter symbol #" + (i + 1) + ": ");
            Character inputSymbol = scanner.nextLine().charAt(0);
            symbolsSet.add(inputSymbol);
        }

        // scanner.nextLine(); // for clearing input buffer!

        // ========= Initial and Final State choice =================================
        int i = 1;
        for (var state : statesSet) {
            System.out.println(i + " " + state);
            ++i;
        }

        System.out.print("Choose the initial state: [1-" + (i-1) + "]: ");
        int choice = scanner.nextInt();
        initialState = statesSet.get(choice-1);
        scanner.nextLine(); // for clearing the input buffer!

        System.out.print("Choose final state: [1-" + (i-1) + "]: ");
        choice = scanner.nextInt();
        finalState = statesSet.get(choice-1);
        scanner.nextLine(); // for clearing the input buffer!

        // ========= For Transition table construction ================================
        System.out.println("Follow onscreen prompts for transition table:");
        for (var state : statesSet) {
            List<List<Character>> tempListOfTransitionData = new ArrayList<>();
            for (var symbol : symbolsSet) {
                System.out.print("On " + symbol + " as input on " + state + " it goes to state: ");
                Character nextState = scanner.nextLine().charAt(0);
                tempListOfTransitionData.add(Arrays.asList(symbol, nextState));
            }
            transitionFnAsMap.put(state, tempListOfTransitionData);
        }

        System.out.println(transitionFnAsMap);

        // ========== Taking the strings input for language =============================
        System.out.print("Enter number of strings to be tested: ");
        int totalStrs = scanner.nextInt();
        scanner.nextLine(); // for clearing the input buffer!

        
        
        // =========== Main code ===========================================
        
        System.out.println("States: " + statesSet);
        i = 0;
        List<String> languageSet = new ArrayList<>();
        List<String> acceptedStrings = new ArrayList<>();
        List<String> rejectedStrings = new ArrayList<>();

        while (i < totalStrs) {
            System.out.print("Enter the string #" + (i+1)+": ");
            String inputStr = scanner.nextLine();
            int result = automaton(statesSet, symbolsSet, transitionFnAsMap, initialState, finalState, inputStr);
            System.out.println(result);
            languageSet.add(inputStr);
            if (result == 1)
                acceptedStrings.add(inputStr);
            if (result == -1)
                rejectedStrings.add(inputStr);

            i++;

        }

        System.out.println("Language: " + languageSet);
        System.out.println("Accepted Strings: " + acceptedStrings);
        System.out.println("Rejected Strings: " + rejectedStrings);

        // String str = "011010101010100111000000011110010110010011010100";

        // checking the running time, yes the time! I have an itch in my mind! Sorry!
        // long startTime = System.nanoTime(); // start time

        // 1 -> Accepted, -1 -> Rejected!
        // System.out.println(automaton(statesSet, symbolsSet, transitionFnAsMap,
        // initialState, finalState, str));

        // ending time
        // long endTime = System.nanoTime();
        // double durationInMilliSex = (endTime - startTime) / 1_000_000.0;
        // System.out.println("Time taken: " + durationInMilliSex + "ms"); // returning
        // the running time!

        scanner.close();
    }

    public static int automaton(List<Character> setOfStates, List<Character> setOfSymbols,
            Map<Character, List<List<Character>>> transitionFnAsTable,
            Character initialState, Character finalState, String string) {
        Character curState = initialState;

        if (!setOfStates.contains(initialState)) {
            throw new IllegalArgumentException("initialState is not in set of states!");
        }

        int i = 0;
        while (i < string.length()) {
            Character parsedInputStr = string.charAt(i); // 0 at ith position

            List<List<Character>> values = transitionFnAsTable.get(curState);

            for (List<Character> value : values) {
                Character inputStr = value.get(0); // 0
                if (parsedInputStr.compareTo(inputStr) == 0) { // enters the condition blk
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