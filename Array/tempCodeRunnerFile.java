
                int currSum=0;
                currSum=i==0?prefix[j-1]:prefix[j-1]-prefix[i-1];
                if(max<currSum){
                    max=c