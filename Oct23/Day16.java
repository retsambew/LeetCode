class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        if(rowIndex==0) return ans;
        for(int i=1; i<=rowIndex; i++){
            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(1);
            for(int j=1; j<ans.size(); j++)
                nextRow.add(ans.get(j-1)+ans.get(j));
            nextRow.add(1);
            ans=nextRow;
        }
        return ans;
    }
}