import java.util.*;

class InputMethods {
    // Method for Integer Input
    static int intInput() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        return a;
    }

    // Method for Long Input
    static long longInput() {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        sc.close();
        return a;
    }

    // Method for Float Input
    static float floatInput() {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        sc.close();
        return a;
    }

    // Method for Double Input
    static double doubleInput() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        sc.close();
        return a;
    }

    // Method for Word Input
    static String wordInput() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        return a;
    }

    // Method for Sentence Input
    static String sentenceInput() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();
        return a;
    }

    // Removes the extra line after Integer input
    static void removeExtraLineAfterIntInput() {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        sc.close();
    }

}

class StringMethods {
    /*
     * Making a String - 
     * String s = new String();
     * String s = "";
     */
    // String To Integer Typecasts
    static int toInt(String s) {
        return Integer.valueOf(s);
    }

    // String To Long Typecasts
    static long toLong(String s) {
        return Long.parseLong(s);
    }

    // String To Float Typecasts
    static float toFloat(String s) {
        return Float.parseFloat(s);
    }

    /** String To Double Typecasts */
    static double toDouble(String s) {
        return Double.parseDouble(s);
    }

    /** Convert a string of one char to char */
    static char toChar(String s){
        return s.charAt(0);
    }

    // Any Object To String Typecasts
    static String toString(Object a) {
        return String.valueOf(a);
    }

    // Slice the list from start to end of the list
    static String slice(String s, int startIndex) {
        return s.substring(startIndex);
    }

    // Slice the list from start to end index specified
    static String slice(String s, int startIndex, int endIndex) {
        return s.substring(startIndex, endIndex);
    }

    // Converting string to list according to sep
    static List<String> split(String s, String sep) {
        String[] sArray = s.split(sep);
        return Arrays.asList(sArray);
    }
    
    static String charToString(char c){
        return Character.toString(c);
    }

    static int getAscii(String str, int index){
        return (int)str.charAt(index);
    }

    static int getAscii(char c){
        return (int)c;
    }

    static char asciiToChar(int i){
        return (char)i;
    }

    static char getChar(String str, int index){
        return str.charAt(index);
    }

    static String getString(String str, int index){
        return Character.toString(str.charAt(index));
    }

}

class ArrayMethods {
    /*
     * Making an Array
     * String[] s = new String[n];
     * String[] s = {"2", "3"};
     * 
     */
    // Converting array to list
    static List<Integer> toList(int[] a) {
        List<Integer> l = new ArrayList<Integer>();
        for (int element : a) {
            ListMethods.append(l, element);
        }
        return l;
    }
    static List<Float> toList(float[] a) {
        List<Float> l = new ArrayList<Float>();
        for (float element : a) {
            ListMethods.append(l, element);
        }
        return l;
    }
    static List<String> toList(String[] a) {
        return Arrays.asList(a);
    }
    static List<Object> toList(Object[] a) {
        return Arrays.asList(a);
    }

    // Print an array
    static void print(int[] a) {
        System.out.println(Arrays.toString(a));
    }
    static void print(float[] a) {
        System.out.println(Arrays.toString(a));
    }
    static void print(Object[] a) {
        System.out.println(Arrays.toString(a));
    }

    // Methods to Join an array as List
    static String join(int[] a) {
        String s = "";
        for (int i = 0; i < CommonMethods.len(a); i++) {
            s += StringMethods.toString(a[i]);
        }
        return s;
    }
    static String join(int[] a, String sep) {
        String s = "";
        for (int i = 0; i < CommonMethods.len(a); i++) {
            s += StringMethods.toString(a[i]);
            if (i != (CommonMethods.len(a) - 1)) {
                s += sep;
            }
        }
        return s;
    }
    static String join(float[] a) {
        String s = "";
        for (int i = 0; i < CommonMethods.len(a); i++) {
            s += StringMethods.toString(a[i]);
        }
        return s;
    }
    static String join(float[] a, String sep) {
        String s = "";
        for (int i = 0; i < CommonMethods.len(a); i++) {
            s += StringMethods.toString(a[i]);
            if (i != (CommonMethods.len(a) - 1)) {
                s += sep;
            }
        }
        return s;
    }
    static String join(Object[] a) {
        String s = "";
        for (int i = 0; i < CommonMethods.len(a); i++) {
            s += StringMethods.toString(a[i]);
        }
        return s;
    }
    static String join(Object[] a, String sep) {
        String s = "";
        for (int i = 0; i < CommonMethods.len(a); i++) {
            s += StringMethods.toString(a[i]);
            if (i != (CommonMethods.len(a) - 1)) {
                s += sep;
            }
        }
        return s;
    }

    // Methods returning the maximum
    static int max(int[] a) {
        return Collections.max(toList(a));
    }
    static float max(float[] a) {
        return Collections.max(toList(a));
    }
    static String max(String[] a) {
        return Collections.max(toList(a));
    }

    // Methods returning the minimum
    static int min(int[] a) {
        return Collections.min(toList(a));
    }
    static float min(float[] a) {
        return Collections.min(toList(a));
    }
    static String min(String[] a) {
        return Collections.min(toList(a));
    }

    // Returns sum of the array
    static int sum(int[] a) {
        int res = 0;
        for (int ele : a) {
            res += ele;
        }
        return res;
    }
    static long sum(long[] a) {
        long res = 0;
        for (long ele : a) {
            res += ele;
        }
        return res;
    }
    static float sum(float[] a) {
        float res = (float) 0;
        for (float ele : a) {
            res += ele;
        }
        return res;
    }
    static double sum(double[] a) {
        double res = (double) 0;
        for (double ele : a) {
            res += ele;
        }
        return res;
    }

    // Sorts the array
    static void sort(int[] a) {
        Arrays.sort(a);
    }
    static void sort(float[] a) {
        Arrays.sort(a);
    }
    static void sort(String[] a) {
        Arrays.sort(a);
    }
    static void sort(Object[] a) {
        Arrays.sort(a);
    }

    // Binary Searches a key
    static int binarySearch(int[] a, int e) {
        int index = Arrays.binarySearch(a, e);
        if (index < 0) {
            return -1;
        }
        return index;
    }
    static long binarySearch(long[] a, long e) {
        long index = Arrays.binarySearch(a, e);
        if (index < 0) {
            return -1;
        }
        return index;
    }
    static int binarySearch(Object[] a, Object e) {
        int index = Arrays.binarySearch(a, e);
        if (index < 0) {
            return -1;
        }
        return index;
    }

    // Comparing two arrays
    // 0 if equal. 1 if a>b. -1 if a<b.
    static int compare(int[]a, int[]b){
        return Arrays.compare(a, b);
    }
    static int compare(float[]a, float[]b){
        return Arrays.compare(a, b);
    }
    static int compare(String[]a, String[]b){
        return Arrays.compare(a, b);
    }
}

class ListMethods {

    /*
     * Making a List
     * ArrayList<> al = new ArrayList<>();
     * LinkedList<> ll = new LinkedList<>();
     * Vector<> v = new Vector<>();
     */

    // Converts list to array
    static Object[] toArray(List l) {
        return l.toArray();
    }

    // Adds a single element to list
    static void append(List l, Object e) {
        l.add(e);
    }

    // Adds all the elements of a List to the List
    static void extend(List l, List l2) {
        l.addAll(l2);
    }

    // Removes by index
    static void remove(List l, int index) {
        l.remove(index);
    }

    // Removes by element
    static void remove(List l, Object e) {
        l.remove(e);
    }

    // Slice the list from start to end of the list
    static List slice(List l, int startIndex) {
        return l.subList(startIndex, l.size());
    }

    // Slice the list from start to end index specified
    static List slice(List l, int startIndex, int endIndex) {
        return l.subList(startIndex, endIndex);
    }

    // Methods to Join a List as String
    static String join(List l) {
        String s = "";
        for (int i = 0; i < CommonMethods.len(l); i++) {
            s += StringMethods.toString(l.get(i));
        }
        return s;
    }

    // Methods to Join a List as String with sep
    static String join(List l, String sep) {
        String s = "";
        for (int i = 0; i < CommonMethods.len(l); i++) {
            s += StringMethods.toString(l.get(i));
            if (i != (CommonMethods.len(l) - 1)) {
                s += sep;
            }
        }
        return s;
    }

    // Only For LinkedList
    // Adds at the head
    static void appendFirst(LinkedList l, Object e) {
        l.addFirst(e);
    }

    // Only For LinkedList
    // Adds at the tail
    static void appendLast(LinkedList l, Object e) {
        l.addLast(e);
    }

    // Only For LinkedList
    // Returns the head value
    static Object peek(LinkedList l) {
        return l.peek();
    }

    // Only For LinkedList
    // Returns the First value
    static Object peekFirst(LinkedList l) {
        return l.peekFirst();
    }

    // Only For LinkedList
    // Returns the Last/Tail value
    static Object peekLast(LinkedList l) {
        return l.peekLast();
    }

    // Only For LinkedList
    // Returns the head value
    static Object poll(LinkedList l) {
        return l.poll();
    }

    // Only For LinkedList
    // Returns and removes the First value
    static Object pollFirst(LinkedList l) {
        return l.pollFirst();
    }

    // Only For LinkedList
    // Returns and removes the Last/Tail value
    static Object pollLast(LinkedList l) {
        return l.pollLast();
    }


    // Sorts the list
    static void sort(List l) {
        Collections.sort(l);
    }

    // Sorts the list in reverse
    static void sortReverse(List l) {
        Collections.sort(l, Collections.reverseOrder());
    }

    // Counts occurence of an element
    static int count(List l, Object e) {
        return Collections.frequency(l, e);
    }

    // Finds first occurence of an element
    static int find(List l, Object e) {
        return l.indexOf(e);
    }

    // Finds last occurence of an element
    static int findLast(List l, Object e) {
        return l.lastIndexOf(e);
    }

    // Finds last occurence of an element
    static int binarySearch(List l, Object e) {
        return Collections.binarySearch(l, e);
    }

    // Reverses the list
    static void reverse(List l) {
        Collections.reverse(l);
    }

    // Checks if a element is present
    static boolean isPresent(List l, Object e) {
        return l.contains(e);
    }

    // Checks if all the element in l2 is present in l1
    static boolean isPresent(List l, List l2) {
        return l.containsAll(l2);
    }

    // Checks if l is empty
    static boolean isEmpty(List l) {
        return l.isEmpty();
    }

    // Checks if two list is equal
    static boolean isEqual(List l1, List l2){
        return l1.equals(l2);
    }


    // Only For Stack
    // Push Element to Stack
    static void push(Stack s, Object e){
        s.push(e);
    }

    // Only for Stack
    // Pop from the head of the element
    static Object pop(Stack s){
        return s.pop();
    }

}

class QueueMethods{
    /*
     * Making a Queue - 
     * Queue<Integer> q = new LinkedList<Integer> ();
     * PriorityQueue<Integer> q = new PriorityQueue<Integer> ();
     */

    // Returns the head value
    static Object peek(Queue q) {
        return q.peek();
    }

    // Removes and returns the head value
    static Object pop(Queue q){
        return q.poll();
    }

    // Adds value at the tail
    static void push(Queue q, Object e){
        q.offer(e);
    }


    // Checks if an element is present
    static boolean isPresent(Queue q, Object e){
        return q.contains(e);
    }

    // Checks if an queue is empty
    static boolean isEmpty(Queue q){
        return q.isEmpty();
    }


    // Checks if an queue is empty
    static boolean isEqual(Queue q1, Queue q2){
        return q1.equals(q2);
    }

    // Makes and returns a max heap
    static PriorityQueue<Integer> maxHeap(){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        return pq;
    }

    // Makes and returns a max heap using a collection
    static PriorityQueue<Integer> maxHeap(Collection<Integer> c){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.addAll(c);
        return pq;
    }

    // Makes and returns a min heap
    static PriorityQueue<Integer> minHeap(){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        return pq;
    }

    // // Makes and returns a min heap using a collection
    static PriorityQueue<Integer> minHeap(Collection<Integer> c){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(c);
        return pq;
    }
}

class DequeMethods{
    /*
     * Making a Deque - 
     * Deque<E> dq = new ArrayDeque<E>();
     * Deque<E> dq = new ArrayDeque<E>(n);
     */

    /**
     Method for adding element 
     at the end/tail of the Deque in ArrayDeque implementation.
     This is different if Deque is implemented using LinkedList.
    */
    static boolean push(Deque dq, Object e){
        return dq.offer(e);
    }

    /**
     Method for adding element 
     at the front/head of the Deque
    */
    static boolean pushFront(Deque dq, Object e){
        return dq.offerFirst(e);
    }

    /**
     Method for adding element 
     at the end/tail of the Deque
    */
    static boolean pushLast(Deque dq, Object e){
        return dq.offerLast(e);
    }

    /**
     Method for returning element 
     from the front/head of the Deque in ArrayDeque implementation.
     This is different if Deque is implemented using LinkedList.
     This does not remove the element.
    */
    static Object peek(Deque dq){
        return dq.peek();
    }

    /**
     Method for returning element 
     from the front/head of the Deque.
     This does not remove the element.
    */
    static Object peekFirst(Deque dq){
        return dq.peekFirst();
    }

    /**
     Method for returning element 
     from the end/tail of the Deque.
     This does not remove the element.
    */
    static Object peekLast(Deque dq){
        return dq.peekLast();
    }

    /**
     Method for removing and returning element 
     from the front/head of the Deque in ArrayDeque implementation.
     This is different if Deque is implemented using LinkedList.
    */
    static Object pop(Deque dq){
        return dq.poll();
    }

    /**
     Method for removing and returning element 
     from the front/head of the Deque.
    */
    static Object popFirst(Deque dq){
        return dq.pollFirst();
    }

    /**
     Method for removing and returning element 
     from the end/tail of the Deque.
    */
    static Object popLast(Deque dq){
        return dq.pollLast();
    }

    // Checks if an element is present
    static boolean isPresent(Deque dq, Object e){
        return dq.contains(e);
    }

    // Checks if an queue is empty
    static boolean isEmpty(Deque dq){
        return dq.isEmpty();
    }


    // Checks if an queue is empty
    static boolean isEqual(Deque dq1, Deque dq2){
        return dq1.equals(dq2);
    }

}

class SetMethods{
    /* Making a Set - 
     * HashSet<E> hs = new HashSet<E>(); <- Unordered
     * LinkedHashSet<E> hs = new LinkedHashSet<E>(); <- Ordered
     */

    /**Adds an element to set */
    static boolean add(Set s, Object e){
        return s.add(e);
    }

    static boolean remove(Set s, Object e){
        return s.remove(e);
    }

    static boolean isPresent(Set s, Object e){
        return s.contains(e);
    }

    static boolean isEmpty(Set s){
        return s.isEmpty();
    }


    static Object[] toArray(Set s){
        return s.toArray();
    }

    static boolean isEqual(Set s1, Set s2){
        return s1.equals(s2);
    }

    static Set union(Set s1, Set s2){
        Set unionSet = new HashSet(s1);
        unionSet.addAll(s2);
        return unionSet;
    }

    static Set intersection(Set s1, Set s2){
        Set intersectionSet = new HashSet(s1);
        intersectionSet.retainAll(s2);
        return intersectionSet;
    }

    static Set difference(Set s1, Set s2){
        Set differenceSet = new HashSet(s1);
        differenceSet.removeAll(s2);
        return differenceSet;
    }
}

class MapMethods{
    static void add(Map m, Object key, Object value){
        m.put(key,value);
    }

    static void addAll(Map m1, Map m2){
        m1.putAll(m2);
    }

    static Object get(Map m, Object key){
        return m.get(key);
    }

    static boolean isEqual(Map m1, Map m2){
        return m1.equals(m2);
    }

    static boolean isKeyPresent(Map m, Object key){
        return m.containsKey(key);
    }

    static boolean isValuePresent(Map m, Object value){
        return m.containsValue(value);
    }

    static Set getKeys(Map m){
        return m.keySet();
    }

    static Collection getValues(Map m){
        return m.values();
    }

    static Collection getElements(Map m){
        return m.entrySet();
    }
    static void clear(Map m){
        m.clear();
    }

    static void print(Map<Object, Object> m){
        for(Map.Entry<Object, Object> e: m.entrySet()){
            System.out.println(e.getKey()+" :: "+e.getValue());
        }
    }
}

class CommonMethods {

    // Methods returning the size of collection
    static int len(String s) {
        return s.length();
    }

    static int len(List l) {
        return l.size();
    }

    static int len(Queue q) {
        return q.size();
    }

    static int len(Deque dq) {
        return dq.size();
    }

    static int len(Collection c) {
        return c.size();
    }

    static int len(Map m) {
        return m.size();
    }

    static int len(int[] a) {
        return a.length;
    }

    static int len(float[] a) {
        return a.length;
    }

    static int len(Object[] a) {
        return a.length;
    }

    static void printCollection(Collection c){
        Iterator iterator = c.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}

public class Main {
    public static void main(String[] args) {

    }

}