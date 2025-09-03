class Solution {
    public String convertDateToBinary(String date) {
        String arr[] = date.split("-");
        StringBuilder sb = new StringBuilder();

        for(String s:arr)
        {
            sb.append("-"+Integer.toBinaryString(Integer.parseInt(s)));
        }
        return sb.toString().substring(1);
    }
}