package o000Oo0;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import o000Ooo.o00O0O;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes2.dex */
public final class Oooo000 implements OooO0o {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final Charset f30360OooOo = Charset.forName("UTF-8");

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final File f30361OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public OooOo f30362OooOo0o;

    public Oooo000(File file) {
        this.f30361OooOo0O = file;
    }

    @Override // o000Oo0.OooO0o
    public final void OooO00o() throws IOException {
        o00O0O.OooO0O0(this.f30362OooOo0o, "There was a problem closing the Crashlytics log file.");
        this.f30362OooOo0o = null;
    }

    public final void OooO0O0() {
        File file = this.f30361OooOo0O;
        if (this.f30362OooOo0o == null) {
            try {
                this.f30362OooOo0o = new OooOo(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // o000Oo0.OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String OooO0o0() {
        /*
            r7 = this;
            java.io.File r0 = r7.f30361OooOo0O
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r1
            goto L3a
        Lc:
            r7.OooO0O0()
            o000Oo0.OooOo r0 = r7.f30362OooOo0o
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r2}
            int r0 = r0.OooOOO0()
            byte[] r0 = new byte[r0]
            o000Oo0.OooOo r4 = r7.f30362OooOo0o     // Catch: java.io.IOException -> L29
            o000Oo0.OooOO0 r5 = new o000Oo0.OooOO0     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r4.OooO0OO(r5)     // Catch: java.io.IOException -> L29
            goto L31
        L29:
            r4 = move-exception
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L31:
            OooO0oO.Oooo0 r4 = new OooO0oO.Oooo0
            r3 = r3[r2]
            r5 = 11
            r4.<init>(r0, r3, r5)
        L3a:
            if (r4 != 0) goto L3e
            r3 = r1
            goto L49
        L3e:
            int r0 = r4.f13285OooOo0o
            byte[] r3 = new byte[r0]
            java.lang.Object r4 = r4.f13283OooOo
            byte[] r4 = (byte[]) r4
            java.lang.System.arraycopy(r4, r2, r3, r2, r0)
        L49:
            if (r3 == 0) goto L53
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = o000Oo0.Oooo000.f30360OooOo
            r0.<init>(r3, r1)
            return r0
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o000Oo0.Oooo000.OooO0o0():java.lang.String");
    }

    @Override // o000Oo0.OooO0o
    public final void OooO0oO(long j, String str) {
        OooO0O0();
        if (this.f30362OooOo0o == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.f30362OooOo0o.OooO00o(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", StringUtils.SPACE).replaceAll("\n", StringUtils.SPACE)).getBytes(f30360OooOo));
            while (!this.f30362OooOo0o.OooO0Oo() && this.f30362OooOo0o.OooOOO0() > 65536) {
                this.f30362OooOo0o.OooO0oo();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }
}
