package androidx.browser.trusted;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return TokenContents.compareByteArrays((byte[]) obj, (byte[]) obj2);
    }
}
