package o00OOOOo;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;
import o000O00.o00O0O0O;
import o00OOOoO.o0000O0;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
public final class OooO0O0 {

    /* renamed from: OooO, reason: collision with root package name */
    public static final o0000O0 f32396OooO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0000O0 f32397OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final o0000O0 f32398OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final o0000O0 f32399OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final o0000O0 f32400OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final o0000O0 f32401OooO0oo;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0000O0 f32402OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0000O0 f32403OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f32404OooO0OO;

    static {
        o0000O0 o0000o02 = o0000O0.f32553OooOoO0;
        f32397OooO0Oo = o00O0O0O.OooOOOo(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        f32399OooO0o0 = o00O0O0O.OooOOOo(Header.RESPONSE_STATUS_UTF8);
        f32398OooO0o = o00O0O0O.OooOOOo(Header.TARGET_METHOD_UTF8);
        f32400OooO0oO = o00O0O0O.OooOOOo(Header.TARGET_PATH_UTF8);
        f32401OooO0oo = o00O0O0O.OooOOOo(Header.TARGET_SCHEME_UTF8);
        f32396OooO = o00O0O0O.OooOOOo(Header.TARGET_AUTHORITY_UTF8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OooO0O0(String str, String str2) {
        this(o00O0O0O.OooOOOo(str), o00O0O0O.OooOOOo(str2));
        o0000O0 o0000o02 = o0000O0.f32553OooOoO0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OooO0O0) {
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            if (this.f32402OooO00o.equals(oooO0O0.f32402OooO00o) && this.f32403OooO0O0.equals(oooO0O0.f32403OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f32403OooO0O0.hashCode() + ((this.f32402OooO00o.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        String strOooOOoo = this.f32402OooO00o.OooOOoo();
        String strOooOOoo2 = this.f32403OooO0O0.OooOOoo();
        byte[] bArr = o00OOO0O.OooO0OO.f32335OooO00o;
        Locale locale = Locale.US;
        return OooO0oO.OooOo.OooOoo(strOooOOoo, ": ", strOooOOoo2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OooO0O0(o0000O0 o0000o02, String str) {
        this(o0000o02, o00O0O0O.OooOOOo(str));
        o0000O0 o0000o03 = o0000O0.f32553OooOoO0;
    }

    public OooO0O0(o0000O0 o0000o02, o0000O0 o0000o03) {
        this.f32402OooO00o = o0000o02;
        this.f32403OooO0O0 = o0000o03;
        this.f32404OooO0OO = o0000o03.OooO0o0() + o0000o02.OooO0o0() + 32;
    }
}
