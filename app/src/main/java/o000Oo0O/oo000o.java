package o000Oo0O;

import OoooOOO.C0001o0;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o000Oo0o.o0ooOOo;

/* loaded from: classes2.dex */
public final class oo000o {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final long f30390OooO0O0 = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f30391OooO0OO = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static oo000o f30392OooO0Oo;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C0001o0 f30393OooO00o;

    public oo000o(C0001o0 c0001o0) {
        this.f30393OooO00o = c0001o0;
    }

    public final boolean OooO00o(o0ooOOo o0ooooo) {
        if (TextUtils.isEmpty(o0ooooo.f30408OooO0OO)) {
            return true;
        }
        long j = o0ooooo.f30410OooO0o + o0ooooo.f30411OooO0o0;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f30393OooO00o.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f30390OooO0O0;
    }
}
