# CurrencyTrading

                                   Introduction to Currency Trading Project
                                   
This project has gone through several years of evolution. It began with my sparetime interest in currency trading 9 years ago in 2006. When I started trading currencies, I faced a series of problems regarding currency-related information gathering. Sometimes I forgot important economic event, sometimes I didn’t know previous economic data so I didn’t dare to buy or sell currency when new economic data came out. That was why I decided to use my Java programming skill to solve my problems!

Through those years I was faced with different trading problems, for this reason I had to write different programs to solve these problems. Because there was no way to foresee any specific problem ahead of time, I had to keep modifying this program frequently every time a new need appeared. Modifying something at one time and then I felt that I needed to do something else and then I had to modify it again, sometimes huge changes! This is probably the most characteristic feature of this project! This is the reason why the current version of this project is not well designed. It works very well and meets my trading need, but its design is not well organized. After so many years of trials and experiences, I feel that it is now the time to re-organize the entire project. I am going to use Spring Frameworks to redesign the entire projects and use J2EE technology to run this program in web browser across internet. This is necessary in some senses!

The codes here are just some of the work I have done so far. It is not finished yet. But I can show you some of snapshots from current version of this project, please see the snapshots in the repos.

This project is aimed to achieve the following goals:

1. Automatically manage important economic events which may have huge impact on market. All economic events,including major economic data releases and important speeches,are automatically downloaded(see snapshot alarm). It shows the event date time, the remaining time, how important it is? The Java technologies used in this feature are: Java http API,thread...etc.

2. Analysize and monitor market trend.Currency trading market is very special. When a currency pair(for example: USDCAD) jumps,it could be market change in USD or CAD.Both USD and CAD can cause this currency pair to fluctuate. Current trading tools in market today show only individual currency pair chart. Traders must look at different currency pair charts to figure out what is going. It takes time for traders to find out what the market situation is. I solve this problem by intruducing individual currency chat,such as USD,CAD,JPY,EUR,ect. Each line represends each individual currency,not currency pair. When market moves, traders can find out which currency is a bigger mover, without the need to check different pair charts(see chart snapshot). The values greater than 0 in chart means that it goes up currently. Traders can easily figure out the current market situation just looking at one chart!

3. The above feature can also be digitalized(see "watching" snapshot). But this digitalized feature is different from chart. The chart displays individual currency only. Digitaliezed little window can monitor each idividual currency pair. One monitor individual currency, the other monitors individual currency pair. This is the difference. When there is a big change in market, it can make siren sound to alert traders.

4. One unique feature about this program is the(to be continued)
