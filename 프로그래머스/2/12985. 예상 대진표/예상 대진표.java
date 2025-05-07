class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        int one = a;
        int two = b;
        while (true){
            if (one == two)
                break;
            if(one % 2 != 0)
                one += 1;
            if(two% 2 != 0)
                two += 1;
            if (one == two)
                break;
            one /= 2;
            two /= 2;
            
            answer += 1;
            continue;
        }

        return answer;
    }
}