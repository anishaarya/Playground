#include <iostream>
using namespace std;
struct time
{
  int seconds;
  int minutes;
  int hours;
};

void diff(struct time, struct time, struct time *);

int main()
{
    struct time t1,t2,di;
    cin >> t1.hours >> t1.minutes >> t1.seconds;

    cin >> t2.hours >> t2.minutes >> t2.seconds;

    diff(t1, t2, &di);

    cout<< di.hours << ":" << di.minutes << ":" << di.seconds;
    return 0;
}
void diff(struct time t1, struct time t2, struct time *di){
    
    if(t2.seconds > t1.seconds)
    {
        --t1.minutes;
        t1.seconds += 60;
    }

    di->seconds = t1.seconds - t2.seconds;
    if(t2.minutes > t1.minutes)
    {
        --t1.hours;
        t1.minutes += 60;
    }
    di->minutes = t1.minutes-t2.minutes;
    di->hours = t1.hours-t2.hours;
}