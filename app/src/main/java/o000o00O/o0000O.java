package o000o00o;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.internal.measurement.o0OOO0;
import java.util.LinkedHashMap;
import java.util.Map;
import o00O0Oo.OooO0O0;
import oo00o.OooOO0;

/* loaded from: classes2.dex */
public final class o0000O {

    /* renamed from: OooO00o */
    public final Context f30751OooO00o;

    /* renamed from: OooO0O0 */
    public final oo00o.OooOOOO f30752OooO0O0;

    /* renamed from: OooO0OO */
    public final int f30753OooO0OO;

    /* renamed from: OooO0Oo */
    public final oo00o.OooOOOO f30754OooO0Oo;

    /* renamed from: OooO0o */
    public boolean f30755OooO0o;

    /* renamed from: OooO0o0 */
    public final oo00o.OooOOOO f30756OooO0o0;

    public o0000O(Context appContext, o00O0OO uuidGenerator) {
        kotlin.jvm.internal.OooOo.OooO0o0(appContext, "appContext");
        kotlin.jvm.internal.OooOo.OooO0o0(uuidGenerator, "uuidGenerator");
        this.f30751OooO00o = appContext;
        final int i = 0;
        this.f30752OooO0O0 = o0OOO0.OooO0oo(new OooO0O0(this) { // from class: o000o00o.o0000O0O

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ o0000O f30761OooOo0o;

            {
                this.f30761OooOo0o = this;
            }

            @Override // o00O0Oo.OooO0O0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((o0000OO0) this.f30761OooOo0o.f30756OooO0o0.getValue()).f30762OooO00o;
                    default:
                        return o00000.OooO0O0(this.f30761OooOo0o.f30751OooO00o);
                }
            }
        });
        this.f30753OooO0OO = Process.myPid();
        this.f30754OooO0Oo = o0OOO0.OooO0oo(new o000OO(uuidGenerator, 0));
        final int i2 = 1;
        this.f30756OooO0o0 = o0OOO0.OooO0oo(new OooO0O0(this) { // from class: o000o00o.o0000O0O

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ o0000O f30761OooOo0o;

            {
                this.f30761OooOo0o = this;
            }

            @Override // o00O0Oo.OooO0O0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((o0000OO0) this.f30761OooOo0o.f30756OooO0o0.getValue()).f30762OooO00o;
                    default:
                        return o00000.OooO0O0(this.f30761OooOo0o.f30751OooO00o);
                }
            }
        });
    }

    public final String OooO00o() {
        return (String) this.f30752OooO0O0.getValue();
    }

    public final Map OooO0O0(Map map) {
        oo00o.OooOOOO oooOOOO = this.f30754OooO0Oo;
        if (map == null) {
            return o00O0.o0O0O00.OooOOOo(new OooOO0(OooO00o(), new o0000O0(Process.myPid(), (String) oooOOOO.getValue())));
        }
        LinkedHashMap linkedHashMapOooOoO0 = o00O0.o0O0O00.OooOoO0(map);
        linkedHashMapOooOoO0.put(OooO00o(), new o0000O0(Process.myPid(), (String) oooOOOO.getValue()));
        return o00O0.o0O0O00.OooOo(linkedHashMapOooOoO0);
    }
}
