class Solution {
    private boolean isBinaryTreeValid(int current, int[] leftChild, int[] rightChild, boolean[] visited) {
        // Check left child
        if (leftChild[current] != -1) {
            if (visited[leftChild[current]]) // Check for cycle
                return false;

            visited[leftChild[current]] = true;
            if (!isBinaryTreeValid(leftChild[current], leftChild, rightChild, visited))
                return false;
        }

        // Check right child
        if (rightChild[current] != -1) {
            if (visited[rightChild[current]]) // Check for cycle
                return false;

            visited[rightChild[current]] = true;
            if (!isBinaryTreeValid(rightChild[current], leftChild, rightChild, visited))
                return false;
        }
        return true;
    }

    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        boolean[] childCount = new boolean[n]; 

        for (int child : leftChild) {
            if (child != -1)
                childCount[child] = true;
        }

        for (int child : rightChild) {
            if (child != -1) {
                if (childCount[child]) 
                    return false;

                childCount[child] = true; 
            }
        }

        int root = -1; 
        for (int i = 0; i < n; ++i) {
            if (!childCount[i]) {
                if (root == -1)
                    root = i; 
                else
                    return false; 
            }
        }

        if (root == -1)
            return false; 

        boolean[] visited = new boolean[n];
        visited[root] = true;
        if (!isBinaryTreeValid(root, leftChild, rightChild, visited))
            return false;

        for (boolean visit : visited)
            if (!visit)
                return false;

        return true; 
    }
}


// class Solution {
//     public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
//         // conditions checked:
//         // there must be only n-1 childs
//         // all n-1 childs should be unique (should only occur once)
//         // there must not be any cycles
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0; i<n; i++){
//             if(leftChild[i]!=-1){
//                 int v = leftChild[i];
//                 if(!set.add(v))
//                     return false;
//                 if(set.contains(leftChild[v]) || set.contains(rightChild[v]))
//                     return false;
//             }
//             if(rightChild[i]!=-1){
//                 int v = rightChild[i];
//                 if(!set.add(v))
//                     return false;
//                 if(leftChild[v]==i || rightChild[v]==i)
//                     return false;
//             }
//         }
//         if(set.size()==n-1)
//             return true;
//         return false;
//     }
// }