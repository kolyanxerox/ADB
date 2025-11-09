package o0000o0;

import com.google.android.gms.internal.ads.InterfaceC1620gw;
import com.google.android.gms.internal.ads.InterfaceC1730jw;

/* loaded from: classes2.dex */
public final class OooOOO implements InterfaceC1730jw {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f29576OooOo0O;

    /* renamed from: OooOo0o */
    public boolean f29577OooOo0o;

    public /* synthetic */ OooOOO(int i) {
        this.f29576OooOo0O = i;
    }

    public synchronized void OooO00o() {
        boolean z = false;
        while (!this.f29577OooOo0o) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean OooO0O0() {
        if (this.f29577OooOo0o) {
            return false;
        }
        this.f29577OooOo0o = true;
        notifyAll();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1730jw, com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        InterfaceC1620gw interfaceC1620gw = (InterfaceC1620gw) obj;
        switch (this.f29576OooOo0O) {
            case 3:
                interfaceC1620gw.OoooO00(this.f29577OooOo0o);
                break;
            default:
                interfaceC1620gw.OoooOo0(this.f29577OooOo0o);
                break;
        }
    }

    public /* synthetic */ OooOOO(boolean z, int i) {
        this.f29576OooOo0O = i;
        this.f29577OooOo0o = z;
    }
}
