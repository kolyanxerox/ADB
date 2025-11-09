package o000o00o;

import java.util.Locale;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class o00O0000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final oo0o0O0 f30834OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0OO f30835OooO0O0;

    public o00O0000(oo0o0O0 timeProvider, o00O0OO uuidGenerator) {
        kotlin.jvm.internal.OooOo.OooO0o0(timeProvider, "timeProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(uuidGenerator, "uuidGenerator");
        this.f30834OooO00o = timeProvider;
        this.f30835OooO0O0 = uuidGenerator;
    }

    public final o000O0 OooO00o(o000O0 o000o0) {
        String str;
        this.f30835OooO0O0.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        kotlin.jvm.internal.OooOo.OooO0Oo(uuidRandomUUID, "randomUUID(...)");
        String string = uuidRandomUUID.toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "toString(...)");
        String lowerCase = o00O0oO.o0000O00.Oooo0(string, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.OooOo.OooO0Oo(lowerCase, "toLowerCase(...)");
        return new o000O0(this.f30834OooO00o.OooO00o().f30861OooO0O0, lowerCase, (o000o0 == null || (str = o000o0.f30779OooO0O0) == null) ? lowerCase : str, o000o0 != null ? o000o0.f30780OooO0OO + 1 : 0);
    }
}
