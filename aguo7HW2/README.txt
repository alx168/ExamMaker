All you have to do is run make and it will automatically start the program after making it.
The Questions and answers are:

Q: What is your name?
A: Alex

Q: What is your goal in life?
A: get a cs degree

Q: What is the answer to life?
A: 42

Q: Your favorite cookie is?
A: chocolate


The answers are case insensitive.

I didn't have time to do javadocs so here's documentation
---------------------------------------------------------

The ExamDriver class is what tests and makes an exam.  You can add multiple choice
questions to it along with single answer questions.  You can also then add in new answers for it.
The classes are organized such that the exam is related to the question class.  The Question class
then has children called MCQuestion and SAQuestion which are both the multiple choice and Single 
Answer classes respectively.  The multiple choice class has a child called MCSAQuestion.  That child
is the multiple choice single answer questions.  The answer classes match the layout of the question
classes almost exactly. Users are prompted for a right answer and then when input it grades the exam
and then tells you how much each question is worth.


Thanks for taking the time to read this and I hope you have a good day.
