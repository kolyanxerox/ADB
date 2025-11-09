package o00O0;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class OooOO0 extends AbstractList implements List, o00O0OoO.OooO0o {
    public abstract int OooO0o();

    public abstract Object OooO0oO(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return OooO0oO(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return OooO0o();
    }
}
