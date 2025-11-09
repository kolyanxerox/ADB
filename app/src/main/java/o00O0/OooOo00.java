package o00O0;

import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class OooOo00 extends o00O0O {
    public static ArrayList OooOoO(Collection collection) {
        kotlin.jvm.internal.OooOo.OooO0o0(collection, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean OooOoO0(Iterable iterable, Object obj) {
        int iIndexOf;
        kotlin.jvm.internal.OooOo.OooO0o0(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    OooOo.OooOo00();
                    throw null;
                }
                if (kotlin.jvm.internal.OooOo.OooO00o(obj, next)) {
                    iIndexOf = i;
                    break;
                }
                i++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    public static Object OooOoOO(List list) {
        kotlin.jvm.internal.OooOo.OooO0o0(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final void OooOoo(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, o00O0Oo.Oooo000 oooo000) {
        kotlin.jvm.internal.OooOo.OooO0o0(iterable, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            Oooo0o0.OooO.OooO0Oo(sb, obj, oooo000);
        }
        sb.append(charSequence3);
    }

    public static Object OooOoo0(List list) {
        kotlin.jvm.internal.OooOo.OooO0o0(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static String OooOooo(Iterable iterable, String str, String str2, String str3, o00O0Oo.Oooo000 oooo000, int i) {
        String prefix = (i & 2) != 0 ? "" : str2;
        String str4 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            oooo000 = null;
        }
        kotlin.jvm.internal.OooOo.OooO0o0(iterable, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(prefix, "prefix");
        StringBuilder sb = new StringBuilder();
        OooOoo(iterable, sb, str, prefix, str4, "...", oooo000);
        return sb.toString();
    }

    public static List Oooo0(List list, Comparator comparator) {
        kotlin.jvm.internal.OooOo.OooO0o0(list, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(comparator, "comparator");
        if (list.size() <= 1) {
            return Oooo0o0(list);
        }
        Object[] array = list.toArray(new Object[0]);
        kotlin.jvm.internal.OooOo.OooO0o0(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return OooOOO.Oooo000(array);
    }

    public static Object Oooo000(List list) {
        kotlin.jvm.internal.OooOo.OooO0o0(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(OooOo.OooOOo0(list));
    }

    public static ArrayList Oooo00O(Iterable elements, Collection collection) {
        kotlin.jvm.internal.OooOo.OooO0o0(collection, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            o00O0O.OooOo0o(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList Oooo00o(Collection collection, Object obj) {
        kotlin.jvm.internal.OooOo.OooO0o0(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List Oooo0O0(int i, List list) {
        if (i < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oO(i, "Requested element count ", " is less than zero.").toString());
        }
        oo000o oo000oVar = oo000o.f31251OooOo0O;
        if (i == 0) {
            return oo000oVar;
        }
        if (i >= list.size()) {
            return Oooo0o0(list);
        }
        if (i == 1) {
            return o0OO0O0.OooOO0o(OooOoOO(list));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : o0OO0O0.OooOO0o(arrayList.get(0)) : oo000oVar;
    }

    public static final void Oooo0OO(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.OooOo.OooO0o0(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static ArrayList Oooo0o(Collection collection) {
        kotlin.jvm.internal.OooOo.OooO0o0(collection, "<this>");
        return new ArrayList(collection);
    }

    public static List Oooo0o0(Iterable iterable) {
        ArrayList arrayListOooo0o;
        kotlin.jvm.internal.OooOo.OooO0o0(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        oo000o oo000oVar = oo000o.f31251OooOo0O;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return oo000oVar;
            }
            if (size != 1) {
                return Oooo0o(collection);
            }
            return o0OO0O0.OooOO0o(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        if (z) {
            arrayListOooo0o = Oooo0o((Collection) iterable);
        } else {
            ArrayList arrayList = new ArrayList();
            Oooo0OO(iterable, arrayList);
            arrayListOooo0o = arrayList;
        }
        int size2 = arrayListOooo0o.size();
        return size2 != 0 ? size2 != 1 ? arrayListOooo0o : o0OO0O0.OooOO0o(arrayListOooo0o.get(0)) : oo000oVar;
    }

    public static Set Oooo0oO(Collection collection) {
        kotlin.jvm.internal.OooOo.OooO0o0(collection, "<this>");
        return new LinkedHashSet(collection);
    }

    public static Set Oooo0oo(Iterable iterable) {
        kotlin.jvm.internal.OooOo.OooO0o0(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        o0ooOOo o0ooooo = o0ooOOo.f31250OooOo0O;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(o0O0O00.OooOOOO(collection.size()));
                    Oooo0OO(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set setSingleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                kotlin.jvm.internal.OooOo.OooO0Oo(setSingleton, "singleton(...)");
                return setSingleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Oooo0OO(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set setSingleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                kotlin.jvm.internal.OooOo.OooO0Oo(setSingleton2, "singleton(...)");
                return setSingleton2;
            }
        }
        return o0ooooo;
    }
}
