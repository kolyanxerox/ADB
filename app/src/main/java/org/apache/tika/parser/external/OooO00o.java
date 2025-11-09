package org.apache.tika.parser.external;

import java.io.InputStream;
import java.util.ArrayList;
import o000oo0.oo000o;
import o000oo0O.o000OOo;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f33313OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f33314OooOo0o;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f33313OooOo0O = i;
        this.f33314OooOo0o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33313OooOo0O) {
            case 0:
                ExternalParser.lambda$ignoreStream$0((InputStream) this.f33314OooOo0o);
                return;
        }
        while (true) {
            oo000o oo000oVar = (oo000o) this.f33314OooOo0o;
            ArrayList arrayList = oo000oVar.f31067OooO0o;
            if (arrayList.isEmpty() || oo000oVar.OooOO0o != null) {
                return;
            }
            ((o000OOo) arrayList.get(0)).f31106OooO00o.run();
            arrayList.remove(0);
        }
    }
}
