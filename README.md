# 310-individual-project
# Description
The project is an interactive dialogue agent for disease diagnosis and treatment, which will use various methods to respond to relevant user questions. The user can ask the agent questions about current physical condition and get brief diagnosis and suggestions. The role of the agent is to answer the relevant information that users need to know when they have physical abnormalities.<Br/>
The structure of the project is to design questions and corresponding answers in advance, but it is not rigid. In the process of implementation, even the same question can be answered differently according to different situations. In this project, all input and output are completed in the console.<Br/>
# Class Description
chat.java<Br/>
Run as the main function and complete the input and output on the console.<Br/><Br/>
dialog.java<Br/>
Store questions and answers.<Br/>
Return the answer to the user’s question.<Br/><Br/>
initial():<Br/>
Input: null<Br/>
Output: null<Br/>
Initialize all questions and corresponding answers.<Br/><Br/>
answer(String question):<Br/>
Input: the question to be answered<Br/>
Output: the answer of the question<Br/>
return the answer to the user’s question.<Br/>
# Description and rationale for the chosen SDLC
Agile development SDLC is chosen in this project.<Br/>
• Program specification, design and implementation are inter-leaved<Br/>
• The system is developed as a series of versions or increments with stakeholders involved in version specification and evaluation<Br/>
• Frequent delivery of new versions for evaluation<Br/>
• Extensive tool support (e.g., automated testing tools) used to support development.<Br/>
• Minimal documentation – focus on working code<Br/>
This is the most suitable life cycle for a project with a small team allocation and a short project timeframe.<Br/>
# Phases
1. Planning<Br/>
1.1 Study existing systems<Br/>
1.2 Create WBS and Gantt chart<Br/>
1.3 Identify the topic of the agent<Br/>
1.4 Define how the user will use the software<Br/>
2. Design<Br/>
2.1 Identify the question and corresponding answer<Br/>
2.2 Identify objects and methods<Br/>
2.3 Design the form of input and output<Br/>
3. Development<Br/>
3.1 Coding<Br/>
4. Testing<Br/>
4.1 Identify and execute test cases<Br/>
4.2 Device testing<Br/>
# WBS
A2:<Br/>
group member: <Br/>
Yihang Wang<Br/>
Bob zhu<Br/>
Eunsuh Lee<Br/>
Ryan LU <Br/>
Xinying Qiao<Br/>

![image](https://github.com/yihang9344/COCS-310-101-2021W2-team/blob/main/image.png)<Br/>
![image3](https://github.com/yihang9344/COCS-310-101-2021W2-team/blob/main/image3.png)<Br/>
A3:<Br/>
group member: <Br/>
Yihang Wang<Br/>
Bob zhu<Br/>
Eunsuh Lee<Br/>
Xinying Qiao<Br/>
<Br/>
Ryan LU - No longer in this group<Br/>

![image2](https://github.com/yihang9344/COCS-310-101-2021W2-team/blob/main/image2.png)
individual project:<Br/>
Xinying Qiao<Br/>

# Limitations
The project is completely realized through mapping, so the problem must be the same as that designed in advance, and the submitted program has no ability to correct errors.
In addition, the answer to the nearest hospital is realized by random number, which is not true.

# Feature List
- Different questions have different answers : When patients ask different health questions, the system will give different responses.<Br/>
 ![response](https://github.com/yihang9344/COCS-310-101-2021W2-team/blob/main/different%20replies.png)
- Detecting positive and negative words in questions: like people say "I'm happy today." and "I'm sad today." will have specific replies.<Br/>
 ![positive](https://github.com/yihang9344/COCS-310-101-2021W2-team/blob/main/positive%20words.png)
 ![negative](https://github.com/yihang9344/COCS-310-101-2021W2-team/blob/main/negative%20words.jpeg)
- Detecting people's name in questions: Like people say "I'm Jojo.", the agent will give them response.<Br/>
 ![name](https://github.com/yihang9344/COCS-310-101-2021W2-team/blob/main/name.jpeg)
- Detecting interjection in questions: If users say "Hey""Hi", the agent will say "Hi, how are you?".<Br/>
 ![UH](https://github.com/yihang9344/COCS-310-101-2021W2-team/blob/main/UH.jpeg)
- At least five off-topic replies:If the user asks an unrelated question, there are five different recovery options.<Br/>
 ![off-topic](https://github.com/yihang9344/COCS-310-101-2021W2-team/blob/main/5%20out-off%20topic.png)
