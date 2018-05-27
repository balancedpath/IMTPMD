package nl.itsjaap.pmdfinal.Database;

public class DatabaseInfo {

    public class UserTable {
        public static final String USERTABLE = "UserTable";
    }

    public class UserColumn {
        public static final String EMAIL  = "email";
        public static final String PASSWORD = "password";
    }

    public class CourseTable {
        public static final String COURSETABLE = "CourseTable";
    }

    public class CourseColumn {
        public static final String NAME  = "name";
        public static final String CREDITS = "credits";
        public static final String GRADE = "grade";
        public static final String PERIOD = "period";
        public static final String YEAR = "year";
        public static final String ISOPT = "isOpt";
    }


}