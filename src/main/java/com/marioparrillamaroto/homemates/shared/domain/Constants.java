package com.marioparrillamaroto.homemates.shared.domain;

public final class Constants {
    public static final class Exceptions {
        public static final class Commons {
            public static final class INVALID_PARAM {
                public static final String CODE = "0000000";
                public static final String MSG = "Invalid request params";
            }
        }

        public static final class Auth {
            public static final class INVALID_REGISTER {
                public static final String CODE = "1000000";
                public static final String MSG = "Invalid register: The user$ already exists";
            }

            public static final class INVALID_LOGIN {
                public static final String CODE = "1000001";
                public static final String MSG = "Invalid login: The user $ is incorrect";
            }
        }
    }
}
