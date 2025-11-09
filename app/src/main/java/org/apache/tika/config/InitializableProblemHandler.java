package org.apache.tika.config;

import o0oOO.OooO0o;
import org.apache.tika.exception.TikaConfigException;

/* loaded from: classes3.dex */
public interface InitializableProblemHandler {
    public static final InitializableProblemHandler DEFAULT;
    public static final InitializableProblemHandler IGNORE = new InitializableProblemHandler() { // from class: org.apache.tika.config.InitializableProblemHandler.1
        @Override // org.apache.tika.config.InitializableProblemHandler
        public void handleInitializableProblem(String str, String str2) {
        }

        public String toString() {
            return "IGNORE";
        }
    };
    public static final InitializableProblemHandler INFO = new InitializableProblemHandler() { // from class: org.apache.tika.config.InitializableProblemHandler.2
        @Override // org.apache.tika.config.InitializableProblemHandler
        public void handleInitializableProblem(String str, String str2) {
            OooO0o.OooO0OO(str).OooOo0O(str2);
        }

        public String toString() {
            return "INFO";
        }
    };
    public static final InitializableProblemHandler THROW;
    public static final InitializableProblemHandler WARN;

    /* renamed from: org.apache.tika.config.InitializableProblemHandler$1 */
    public class C45241 implements InitializableProblemHandler {
        @Override // org.apache.tika.config.InitializableProblemHandler
        public void handleInitializableProblem(String str, String str2) {
        }

        public String toString() {
            return "IGNORE";
        }
    }

    /* renamed from: org.apache.tika.config.InitializableProblemHandler$2 */
    public class C45252 implements InitializableProblemHandler {
        @Override // org.apache.tika.config.InitializableProblemHandler
        public void handleInitializableProblem(String str, String str2) {
            OooO0o.OooO0OO(str).OooOo0O(str2);
        }

        public String toString() {
            return "INFO";
        }
    }

    /* renamed from: org.apache.tika.config.InitializableProblemHandler$3 */
    public class C45263 implements InitializableProblemHandler {
        @Override // org.apache.tika.config.InitializableProblemHandler
        public void handleInitializableProblem(String str, String str2) {
            OooO0o.OooO0OO(str).OooOo0o(str2);
        }

        public String toString() {
            return "WARN";
        }
    }

    /* renamed from: org.apache.tika.config.InitializableProblemHandler$4 */
    public class C45274 implements InitializableProblemHandler {
        @Override // org.apache.tika.config.InitializableProblemHandler
        public void handleInitializableProblem(String str, String str2) throws TikaConfigException {
            throw new TikaConfigException(str2);
        }

        public String toString() {
            return "THROW";
        }
    }

    static {
        C45263 c45263 = new InitializableProblemHandler() { // from class: org.apache.tika.config.InitializableProblemHandler.3
            @Override // org.apache.tika.config.InitializableProblemHandler
            public void handleInitializableProblem(String str, String str2) {
                OooO0o.OooO0OO(str).OooOo0o(str2);
            }

            public String toString() {
                return "WARN";
            }
        };
        WARN = c45263;
        THROW = new InitializableProblemHandler() { // from class: org.apache.tika.config.InitializableProblemHandler.4
            @Override // org.apache.tika.config.InitializableProblemHandler
            public void handleInitializableProblem(String str, String str2) throws TikaConfigException {
                throw new TikaConfigException(str2);
            }

            public String toString() {
                return "THROW";
            }
        };
        DEFAULT = c45263;
    }

    void handleInitializableProblem(String str, String str2) throws TikaConfigException;
}
