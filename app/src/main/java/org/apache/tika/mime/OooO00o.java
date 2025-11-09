package org.apache.tika.mime;

import java.net.URL;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements Consumer {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f33311OooOo0O;

    public /* synthetic */ OooO00o(int i) {
        this.f33311OooOo0O = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f33311OooOo0O) {
            case 0:
                MimeTypesFactory.lambda$create$0((URL) obj);
                break;
            case 1:
                ((Process) obj).destroyForcibly();
                break;
            default:
                ((Process) obj).destroyForcibly();
                break;
        }
    }
}
