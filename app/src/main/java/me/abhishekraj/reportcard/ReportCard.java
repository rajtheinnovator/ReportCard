package me.abhishekraj.reportcard;

/**
 * Created by ABHISHEK RAJ on 9/10/2016.
 */
public class ReportCard {
    private String mStudentName; //student name variable
    private int mEngineeringChemistryEarnedCredit; // variable for storing credit earned for subject chemistry
    private int mEngineeringMathematicsEarnedCredit;  // variable for storing credit earned for subject Mathematics
    private int mCommunicationSkillsEarnedCredit;  // variable for storing credit earned for subject Communication Skills
    private int mEngineeringGraphicsEarnedCredit;  // variable for storing credit earned for subject Engineering Graphics
    final private int mTotalCredit = 4;  // Total credit of a subject for which exams are conducted
    private String mEngineeringChemistryEarnedGrade; // variable for storing grade earned for subject chemistry
    private String mEngineeringMathematicsEarnedgrade;   // variable for storing grade earned for subject Mathematics
    private String mCommunicationSkillsEarnedGrade;  // variable for storing grade earned for subject Communication Skills
    private String mEngineeringGraphicsEarnedGrade;   // variable for storing grade earned for subject Engineering Graphics

    // Setting public constructor
    public ReportCard(int engineeringChemistryEarnedCredit, int engineeringMathematicsEarnedCredit
            , int communicationSkillsEarnedCredit, int engineeringGraphicsEarnedCredit) {
        mEngineeringChemistryEarnedCredit = engineeringChemistryEarnedCredit;
        mEngineeringMathematicsEarnedCredit = engineeringMathematicsEarnedCredit;
        mCommunicationSkillsEarnedCredit = communicationSkillsEarnedCredit;
        mEngineeringGraphicsEarnedCredit = engineeringGraphicsEarnedCredit;
    }
    //setter method for setting student name
    public void setStudentName(String name) {
        mStudentName = name;
    }
    //setter metod for setting Grade and credit of subject Chemistry but just taking one integer input for credit
    public void setEngineeringChemistryEarnedCredit(int credit) {
        mEngineeringChemistryEarnedCredit = credit;
        //setting grade of subject Engineering Chemistry
        if (credit == 4)

        {
            mEngineeringChemistryEarnedGrade = "A+";
        } else if (credit == 3)

        {
            mEngineeringChemistryEarnedGrade = "B+";
        } else

        {
            mEngineeringChemistryEarnedGrade = "C";
        }
    }
    //setter metod for setting Grade and credit of subject Mathematics but just taking one integer input for credit
    public void setEngineeringMathematicsEarnedCredit(int credit) {
        mEngineeringMathematicsEarnedCredit = credit;
        //setting Grade of Engineering Mathemetics
        if (credit == 4)

        {
            mEngineeringMathematicsEarnedgrade = "A+";
        } else if (credit == 3)

        {
            mEngineeringMathematicsEarnedgrade = "B+";
        } else

        {
            mEngineeringMathematicsEarnedgrade = "C";
        }
    }
    //setter metod for setting Grade and credit of subject Communication Skills but just taking one integer input for credit
    public void setCommunicationSkillsEarnedCredit(int credit) {
        mCommunicationSkillsEarnedCredit = credit;
        //setting Grade of Comunication Skills
        if (credit == 4)

        {
            mCommunicationSkillsEarnedGrade = "A+";
        } else if (credit == 3)

        {
            mCommunicationSkillsEarnedGrade = "B+";
        } else

        {
            mCommunicationSkillsEarnedGrade = "C";
        }
    }
    //setter metod for setting Grade and credit of subject Engineering Graphics but just taking one integer input for credit
    public void setEngineeringGraphicsEarnedCredit(int credit) {
        mEngineeringGraphicsEarnedCredit = credit;
        //setting Grade of Engineering Graphics
        if (credit == 4)

        {
            mEngineeringGraphicsEarnedGrade = "A+";
        } else if (credit == 3)

        {
            mEngineeringGraphicsEarnedGrade = "B+";
        } else

        {
            mEngineeringGraphicsEarnedGrade = "C";
        }
    }
    // setting public getter for credit score of subject Chemistry
    public int getEngineeringChemistryEarnedCredit() {
        return mEngineeringChemistryEarnedCredit;
    }
    // setting public getter for credit score of subject Mathematics
    public int getEngineeringMathematicsEarnedCredit() {
        return mEngineeringMathematicsEarnedCredit;
    }
    // setting public getter for credit score of subject Communication Skills
    public int getCommunicationSkillsEarnedCredit() {
        return mCommunicationSkillsEarnedCredit;
    }
    // setting public getter for credit score of subject Engineering Graphics
    public int getEngineeringGraphicsEarnedCredit() {
        return mEngineeringGraphicsEarnedCredit;
    }
    // @override toString() method so that it returns appropriate information
    @Override
    public String toString() {
        String overalldescription = "Student name: " + mStudentName;
        /*description for chemistry subject*/
        overalldescription += "\n Subject: Chemistry, Earned a total credit of: " +
                mEngineeringChemistryEarnedCredit + "out of total" + " credit: " + mTotalCredit +
                "and passed with a grade of: " + mEngineeringChemistryEarnedGrade;
        /*description for mathematics subject*/
        overalldescription += "\n Subject: Mathematics, Earned a total credit of: " +
                mEngineeringMathematicsEarnedCredit + "out of total" + " credit: " + mTotalCredit +
                "and passed with a grade of: " + mEngineeringMathematicsEarnedgrade;
        /*description for subject Communication skills*/
        overalldescription += "\n Subject: Communication skills, Earned a total credit of: " +
                mCommunicationSkillsEarnedCredit + "out of total" + " credit: " + mTotalCredit +
                "and passed with a grade of: " + mCommunicationSkillsEarnedGrade;
         /*description for subject Engineering Graphics*/
        overalldescription += "\n Subject: Engineering Graphics, Earned a total credit of: " +
                mEngineeringGraphicsEarnedCredit + "out of total" + " credit: " + mTotalCredit +
                "and passed with a grade of: " + mEngineeringGraphicsEarnedGrade;
        return overalldescription;
    }
}