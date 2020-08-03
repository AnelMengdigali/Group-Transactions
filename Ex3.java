class Result {
    
    static HashMap<String, Integer> operation = new HashMap<>();
    static HashSet<String> checker = new HashSet<>();
    static List<String> transactionsResult = new ArrayList<>();
    
    public static List<String> groupTransactions( List<String> transactions ) {
        
        Collections.sort( transactions );
        
        for( String item: transactions ){
            
            Integer numTransactions = operation.get( item );
            
            operation.put( item, ( numTransactions == null ) ? 1 : numTransactions + 1 );
            
        }
        
        for ( String item: transactions ){
            
            if( ! checker.contains( item ) ){
                
                transactionsResult.add( item + " " + operation.get( item ) );
                
                checker.add( item );
                
            }
            
        }
        
        return transactionsResult;
        
    }
    
}