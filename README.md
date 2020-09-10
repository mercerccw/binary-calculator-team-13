# Binary Calculator
## Team 13
Members
- Clayton Mercer
- Sara Bailey
- Nicholas Burrell
- Zach Hoeing
- Brian Ringer

## Prerequisites 
Requirements
- [Install Java JDK 14](https://www.oracle.com/java/technologies/javase-jdk14-downloads.html)

## Git Practices
The <code>master</code> branch and <code>develop</code> branch are restricted and thus cannot be pushed to directly. 
In order to merge into <code>master</code> or <code>develop</code>, a pull request must be submitted and approved by 3 developers.

The <code>develop</code> branch is the main working branch and when a developer begins coding a
feature, they must branch off of <code>develop</code> (making a new branch with the name of the feature inside
the branch name) and submit a pull request from the completed feature branch to be merged back into <code>develop</code> once they have completed the feature.
Once all features have been completed on <code>develop</code> for the final version, a final pull request will be submitted and all previous
work will be merged to <code>master</code>.  

## Meetings

#### 9/8/2020 7:30PM

- Attendance: 
    - Clayton, Zach, Nicholas
- Topics: 
    - Covered project requirements and initial setup
    - Reviewed git flow and pull request process
    - Assigned Tasks
    - Reviewed Sara's pull request and merged
- Resources
    - Git commands to remember
        - Check current project status: <code>git status</code>
        - Create a new branch: <code>git checkout -b name-of-branch</code> (feature in name)
        - Add changes: <code>git add .</code>
        - Committing: <code>git commit -m "Commit message"</code> (commit in present tense)
        - Pulling: <code>git pull</code>
        - Pushing branch: <code>git push</code>
            - If this doesn't push run this: <code>git push --set-upstream origin branch-name</code>
