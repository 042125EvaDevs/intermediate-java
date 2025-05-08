# IntermediateJava Resources

## Object-Oriented Programming Assignment

In this assignment, you will demonstrate your understanding of the core OOP concepts covered in Week 2.

### Task Description

Create a simple Library Management System that implements the following OOP concepts:

- **Classes and Objects:** Design classes for Book, Library, and Member
- **Inheritance:** Create different types of books (e.g., Fiction, NonFiction) that inherit from the Book class
- **Polymorphism:** Implement different borrowing behaviors for different types of books
- **Encapsulation:** Use proper access modifiers and getter/setter methods
- **Abstraction:** Create appropriate abstract classes or interfaces

### Requirements

- Implement all five OOP concepts covered in the lectures
- Include proper documentation and comments
- Write a brief explanation of how each OOP principle is used in your code

### Submission Guidelines

- Submit your Java source code files
- Include a README file explaining how to run your program
- Add comments explaining the implementation of each OOP concept

### Evaluation Criteria

- Correct implementation of OOP concepts (50%)
- Code organization and clarity (25%)
- Documentation quality (25%)

## Getting started

**Create a directory for this cohort**

```bash
# Navigate to your home folder
cd ~/

# create a new folder for Eva related files/folders
mkdir eva-cohort
cd eva-cohort
```

**Clone this repository on to your filesystem**

```bash
git clone https://github.com/042125EvaDevs/intermediate-java.git
```


**Create a new branch with your name as the branch name**
```bash
git checkout -b <your-name>
```
> This is where you will implement your code changes

## Development Tools
- [Git - _version control_](https://git-scm.com/downloads)
- [VS Code - _code editor_](https://code.visualstudio.com/download)


## Download updates from Github

Checkout the main branch
```bash
# switch shared branch between everyone
git checkout main

# download updates from online Github repository
git fetch

# Pull changes into local main branch
git pull
```

Merge changes into your branch
```bash
git checkout <your-branch>
git merge main
```

## Pushing changes to github

Stages changes to be committed to git

```bash
git add .
```

Commit changes to git with a message about the changes.
```bash
# Leave a message about changes made
git commit -m "added nav button"
```

Push to github
```bash
# if you have not created the branch on github yet
git push -u origin <your-branch-name>

# otherwise this will push to your branch on github
git push
```
