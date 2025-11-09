package o00OoO00;

import OooOOo.OooOOO;
import java.io.PrintStream;

/* loaded from: classes3.dex */
public abstract class OooO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final int f32685OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final int f32686OooO0O0;

    static {
        int i;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        int i2 = 2;
        if (property == null || property.isEmpty()) {
            i = 1;
        } else {
            for (int i3 = 0; i3 < 3; i3++) {
                if (strArr[i3].equalsIgnoreCase(property)) {
                    i = 2;
                    break;
                }
            }
            i = 1;
        }
        f32685OooO00o = i;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                i2 = 1;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                i2 = 4;
            } else if (property2.equalsIgnoreCase("WARN")) {
                i2 = 3;
            }
        }
        f32686OooO0O0 = i2;
    }

    public static final void OooO00o(String str, Throwable th) {
        OooO0O0().println("SLF4J(E): " + str);
        OooO0O0().println("SLF4J(E): Reported exception:");
        th.printStackTrace(OooO0O0());
    }

    public static PrintStream OooO0O0() {
        return OooOOO.OooO0O0(f32685OooO00o) != 1 ? System.err : System.out;
    }

    public static final void OooO0OO(String str) {
        if (OooOOO.OooO0O0(3) >= OooOOO.OooO0O0(f32686OooO0O0)) {
            OooO0O0().println("SLF4J(W): " + str);
        }
    }
}
