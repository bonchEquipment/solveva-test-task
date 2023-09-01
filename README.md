# solveva-test-task
Fizz buzz game playable via http

# How to play
In order to play you should send http post request with body of such format  {
"numbers" : [1, 2, 3, 55, 15, 30]
}
and aslo add header Content-Type=application/json

The appication will return the same numbers, but all of the numbers divisible by three will be replaced with the word "fizz" and numbers divisible by five with the word "buzz".
