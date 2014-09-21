The Wait/Notify Mechanism
==============

Example1

In multi-threaded programs, often there is a need for one thread to communicate to another thread. The wait/notify
mechanism is useful when threads must communicate in order to provide a functionality.
Let’s take the example of a coffee shop. A waiter is using a coffee machine in a coffee shop and delivering coffee
to customers. The coffee machine in this coffee shop is an antique machine: it makes one cup of coffee at a time,
and it takes five to ten minutes time to make a cup. The waiter does not have to be idle while waiting for the coffee
machine to complete making coffee; he can go to customers in the meantime to deliver the coffee prepared earlier.
This example is a little contrived, though: assume that coffee machine keeps making the coffee and waiter keeps
delivering it.
The method wait() allows the calling thread to wait for the wait object (on which wait() is called). In other
words, if you want to make a thread wait for another thread, you can ask it to wait for the wait object using the wait()
method. A thread remains in the wait state until some another thread calls the notify() or notifyAll() method
on the wait object. To understand the wait/notify mechanism, you are going to simulate this coffee shop situation in
a program. You can implement the coffee machine as one thread and the waiter as another thread in two different
classes. The coffee machine can notify the waiter to take the coffee, and it can wait until the waiter has taken the
coffee from the tray. Similarly, the waiter can take the coffee if it is available and notify the coffee machine to make
another cup.
