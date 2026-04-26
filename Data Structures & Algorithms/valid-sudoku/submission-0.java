class Solution {
    public boolean isValidSudoku(char[][] board) {
        // every possible row
        for(int i = 0 ; i < 9 ; ++i ){
            Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();
            for(int j = 0 ; j < 9 ; ++j ){
                char rowChar = board[i][j];
                char colChar = board[j][i];

                if(rowChar != '.'){
                    if(rowSet.contains(rowChar)){
                        return false;
                    }
                    else{
                        rowSet.add(rowChar);
                    }
                }

               if(colChar != '.'){
                    if(colSet.contains(colChar)){
                        return false;
                    }
                    else{
                        colSet.add(colChar);
                    }
                }
            }
        }

        // every possible col
        // for( int j = 0 ; j < 9 ; ++j ){
        //     Set<Character> colSet = new HashSet<>();
        //       for( int i = 0 ; i < 9 ; ++i ){
        //         char curr_char = board[i][j];
        //         if( curr_char != '.' && !colSet.add(curr_char)){
        //             return false;
        //         }
        //     }
        // }
        // 3 * 3 grid (checking subgrid)
         for( int row = 0 ; row < 9 ; row += 3 ){
            for( int col = 0 ; col < 9 ; col += 3 ){
                Set<Character> gridSet = new HashSet<>();
               for( int i = row ; i < row + 3 ; ++i){
                    for( int j = col ; j < col + 3 ; ++j ){
                        char curr_char = board[i][j];
                        if( curr_char == '.'){
                            continue;
                        }
                        if(gridSet.contains(curr_char)){
                            return false;
                        }
                        gridSet.add(curr_char);
                    }
               }
            }
        }
        return true;
    }
}
