# java-searching-techniques

This REPO contains some commonly used array searching techniques
<br />Please ⭐ this repository if you found it helpful so that more people can benifit from this code 😃.
<br />
<br />
[Get current updates on open issues and pull requests]

## [linear search]
```
//linear Search 
for(int i = 0 ; i < a.length ; i++)
{
  if( key == a[i])
  {
    flag = true; 
    index = i; 
    position = i+1;
    break;
  }
} 
```
![image8 2 0](https://user-images.githubusercontent.com/76808676/105989215-ce8bed80-60c6-11eb-8fa4-e1d0d2ef5db3.png)


## [binary search]
```
while(low <= high)
{
  mid = low + (high - low) / 2;
            
  if( key == a[mid])
  {
    flag = true;
    position = mid+1;
    break;
  }
  else if( key < a[mid] ) 
  {
    high = mid -1 ;
  }
  else if( key > a[mid] )
  {
    low = mid + 1;
  }  
}
```
![image8 2 1](https://user-images.githubusercontent.com/76808676/105989216-cfbd1a80-60c6-11eb-8da9-2cdc5046eb0d.png)



[linear search]: https://github.com/voyager2005/java-searching-techiniques/blob/main/linearSearch.java
[binary search]: https://github.com/voyager2005/java-searching-techiniques/blob/main/binarySearch.java
[Get current updates on open issues and pull requests]: https://github.com/voyager2005/java-searching-techiniques/pulse/monthly
