/*
题目：#14
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。

*/


class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)return "";					//空字符串数组返回空字符串“”
        if(strs.length == 1)return strs[0];				//仅有一个字符串时返回该字符串
        int min_strs = strs[0].length();				//最终返回的前缀最大长度一定小于等于字符串数组当中的最小长度字符串
        String out_strs = "";
        boolean if_same = false;
        for(int i = 0;i < strs.length;i++){				//获取最小长度字符串
            min_strs = min_strs < strs[i].length() ? min_strs : strs[i].length();
        }
        for(int i = 0;i < min_strs;i++){				//寻找各字符串的相同前缀
            for(int j = 0;j < strs.length - 1;j++){
                if((strs[j].charAt(i)) == (strs[j+1].charAt(i))){
                    if_same = true;
                }else{
                    if_same = false;
                    break;
                }
            }
            if(if_same){
                out_strs += strs[0].charAt(i);
                if_same = false;
            }else
                break;
        }
        return out_strs;
    }
}