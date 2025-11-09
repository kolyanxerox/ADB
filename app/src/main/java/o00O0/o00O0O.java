package o00O0;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class o00O0O extends o0OoOo0 {
    public static void OooOo(Collection collection, Object[] elements) {
        kotlin.jvm.internal.OooOo.OooO0o0(collection, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(elements, "elements");
        collection.addAll(OooOOO.Oooo000(elements));
    }

    public static void OooOo0o(Iterable elements, Collection collection) {
        kotlin.jvm.internal.OooOo.OooO0o0(collection, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }
}
