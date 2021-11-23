class FirstUnique {
  
  private Set<Integer> setQueue = new LinkedHashSet<>();
  private Set<Integer> isUnique = new HashSet<>();
  
  public FirstUnique(int[] nums) {
    for (int num : nums) {
      this.add(num);
    }
  }
    
  public int showFirstUnique() {
    // If the queue contains values, we need to get the first one from it.
    // We can do this by making an iterator, and getting its first item.
    if (!setQueue.isEmpty()) {
       return setQueue.iterator().next();
    }
    return -1;
  }
    
  public void add(int value) {
    // Case 1: This value is not yet in the data structure.
    // It should be ADDED.
    if (!isUnique.contains(value)) {
      isUnique.add(value);
      setQueue.add(value);
    // Case 2: This value has been seen once, so is now becoming
    // non-unique. It should be REMOVED.
    } else {
      setQueue.remove(value);
    }
  }
}
