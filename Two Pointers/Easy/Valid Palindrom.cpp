class Solution
{
    public:
    bool isPalindrome(string s)
    {

        int i = 0;
        int j = s.length() - 1;
         transform(s.begin(),s.end(),s.begin(), ::tolower);
        for(int i=0;i<s.length();i++)
        {
            if(ispunct(s[i]))
            {
                s.erase(i--,1);
               int len = s.length();
            }
        }
        s.erase(remove(s.begin(), s.end(), ' '),s.end());
        // cout<<s<<"\n";
        // while(i<=j){
        //     // cout<<s[i]<<" "<<s[j-i]<<"\n";
        //     cout<<i<<" "<<j<<"\n";
        //     i++;
        //     j--;
        // }
        int q = 0,w = s.length();
        while(q<w)
        {
            if(s[q] == s[w])
            {
                q++;
                w--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
};