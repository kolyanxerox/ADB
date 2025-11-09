package o00O0oOO;

import java.util.concurrent.TimeUnit;
import o000O00.o00O0O0O;

/* loaded from: classes3.dex */
public final class OooOOO extends Enum {

    /* renamed from: OooOo */
    public static final OooOOO f31464OooOo;

    /* renamed from: OooOo0o */
    public static final OooOOO f31465OooOo0o;

    /* renamed from: OooOoO */
    public static final OooOOO f31466OooOoO;

    /* renamed from: OooOoO0 */
    public static final OooOOO f31467OooOoO0;

    /* renamed from: OooOoOO */
    public static final OooOOO f31468OooOoOO;

    /* renamed from: OooOoo */
    public static final /* synthetic */ OooOOO[] f31469OooOoo;

    /* renamed from: OooOoo0 */
    public static final OooOOO f31470OooOoo0;

    /* renamed from: OooOo0O */
    public final TimeUnit f31471OooOo0O;

    static {
        OooOOO oooOOO = new OooOOO("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f31465OooOo0o = oooOOO;
        OooOOO oooOOO2 = new OooOOO("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        OooOOO oooOOO3 = new OooOOO("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f31464OooOo = oooOOO3;
        OooOOO oooOOO4 = new OooOOO("SECONDS", 3, TimeUnit.SECONDS);
        f31467OooOoO0 = oooOOO4;
        OooOOO oooOOO5 = new OooOOO("MINUTES", 4, TimeUnit.MINUTES);
        f31466OooOoO = oooOOO5;
        OooOOO oooOOO6 = new OooOOO("HOURS", 5, TimeUnit.HOURS);
        f31468OooOoOO = oooOOO6;
        OooOOO oooOOO7 = new OooOOO("DAYS", 6, TimeUnit.DAYS);
        f31470OooOoo0 = oooOOO7;
        OooOOO[] oooOOOArr = {oooOOO, oooOOO2, oooOOO3, oooOOO4, oooOOO5, oooOOO6, oooOOO7};
        f31469OooOoo = oooOOOArr;
        o00O0O0O.OooOOo(oooOOOArr);
    }

    public OooOOO(String str, int i, TimeUnit timeUnit) {
        super(str, i);
        this.f31471OooOo0O = timeUnit;
    }

    public static OooOOO valueOf(String str) {
        return (OooOOO) Enum.valueOf(OooOOO.class, str);
    }

    public static OooOOO[] values() {
        return (OooOOO[]) f31469OooOoo.clone();
    }
}
