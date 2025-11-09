package o00OOO0;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes3.dex */
public final class o00000O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f32229OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Proxy f32230OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final InetSocketAddress f32231OooO0OO;

    public o00000O0(OooO00o oooO00o, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (oooO00o == null) {
            throw new NullPointerException("address == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f32229OooO00o = oooO00o;
        this.f32230OooO0O0 = proxy;
        this.f32231OooO0OO = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o00000O0)) {
            return false;
        }
        o00000O0 o00000o02 = (o00000O0) obj;
        return o00000o02.f32229OooO00o.equals(this.f32229OooO00o) && o00000o02.f32230OooO0O0.equals(this.f32230OooO0O0) && o00000o02.f32231OooO0OO.equals(this.f32231OooO0OO);
    }

    public final int hashCode() {
        return this.f32231OooO0OO.hashCode() + ((this.f32230OooO0O0.hashCode() + ((this.f32229OooO00o.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f32231OooO0OO + "}";
    }
}
