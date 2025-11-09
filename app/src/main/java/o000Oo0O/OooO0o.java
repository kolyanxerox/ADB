package o000OO0o;

import java.util.Map;
import o000OO00.OooO0O0;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO0o implements o000OO00.OooO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f30218OooO00o;

    @Override // o000OO00.OooO00o
    public final void OooO00o(Object obj, Object obj2) {
        switch (this.f30218OooO00o) {
            case 0:
                throw new OooO0O0("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                o000OO00.OooO oooO = (o000OO00.OooO) obj2;
                oooO.OooO0O0(o000OOO.OooO.f30236OooO0oO, entry.getKey());
                oooO.OooO0O0(o000OOO.OooO.f30237OooO0oo, entry.getValue());
                return;
            default:
                throw new OooO0O0("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
