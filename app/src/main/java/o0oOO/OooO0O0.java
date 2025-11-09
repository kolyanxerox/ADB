package o0oOO;

import java.io.Serializable;

/* loaded from: classes3.dex */
public interface OooO0O0 {
    void OooO(String str, Throwable th);

    boolean OooO00o();

    boolean OooO0O0();

    void OooO0OO(String str, Object... objArr);

    boolean OooO0o();

    boolean OooO0o0();

    void OooO0oO(String str, Object obj, Serializable serializable);

    void OooO0oo(String str, Object... objArr);

    void OooOO0(Object obj, String str);

    void OooOO0O(Object obj, String str, Object obj2);

    void OooOO0o(Integer num, String str);

    void OooOOO(String str, Object obj, Serializable serializable);

    void OooOOO0(String str, Serializable serializable);

    void OooOOOO(String str, Throwable th);

    boolean OooOOOo();

    void OooOOo(String str, Object obj);

    void OooOOo0(String str);

    void OooOOoo(Object... objArr);

    void OooOo(String str);

    void OooOo0(String str, Throwable th);

    void OooOo00(Integer num, String str);

    void OooOo0O(String str);

    void OooOo0o(String str);

    void OooOoO(Object obj, String str);

    default boolean OooOoO0(int i) {
        char c;
        if (i == 1) {
            c = '(';
        } else if (i == 2) {
            c = 30;
        } else if (i == 3) {
            c = 20;
        } else if (i == 4) {
            c = '\n';
        } else {
            if (i != 5) {
                throw null;
            }
            c = 0;
        }
        if (c == 0) {
            return OooO0o();
        }
        if (c == '\n') {
            return OooO0O0();
        }
        if (c == 20) {
            return OooO0o0();
        }
        if (c == 30) {
            return OooO00o();
        }
        if (c == '(') {
            return OooOOOo();
        }
        StringBuilder sb = new StringBuilder("Level [");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TRACE" : "DEBUG" : "INFO" : "WARN" : "ERROR");
        sb.append("] not recognized.");
        throw new IllegalArgumentException(sb.toString());
    }

    void OooOoOO(String str, Object obj, Serializable serializable);

    String getName();
}
