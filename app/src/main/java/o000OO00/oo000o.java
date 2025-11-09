package o000oo00;

import OooooOo.oOOOoo00;
import com.nextaix.common.helper.MdnsForegroundService;

/* loaded from: classes2.dex */
public final class oo000o implements OooOo00 {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f31104OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ MdnsForegroundService f31105OooOo0o;

    public /* synthetic */ oo000o(MdnsForegroundService mdnsForegroundService, int i) {
        this.f31104OooOo0O = i;
        this.f31105OooOo0o = mdnsForegroundService;
    }

    @Override // o000oo00.OooOo00
    public final void OooO0O0(int i, String str, boolean z) {
        switch (this.f31104OooOo0O) {
            case 0:
                this.f31105OooOo0o.f28610OooOo.post(new Oooo0(str, i, 1, z));
                break;
            default:
                this.f31105OooOo0o.f28610OooOo.post(new oOOOoo00(this, i, str, z));
                break;
        }
    }
}
