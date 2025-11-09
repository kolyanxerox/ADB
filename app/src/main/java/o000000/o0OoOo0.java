package o000000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class o0OoOo0 extends o0ooOOo {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f29125OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Matrix f29126OooO0Oo;

    public o0OoOo0(ArrayList arrayList, Matrix matrix) {
        this.f29125OooO0OO = arrayList;
        this.f29126OooO0Oo = matrix;
    }

    @Override // o000000.o0ooOOo
    public final void OooO00o(Matrix matrix, o000OOo.OooOOO oooOOO, int i, Canvas canvas) {
        ArrayList arrayList = this.f29125OooO0OO;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((o0ooOOo) obj).OooO00o(this.f29126OooO0Oo, oooOOO, i, canvas);
        }
    }
}
