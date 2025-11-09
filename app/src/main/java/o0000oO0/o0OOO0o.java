package o0000oo0;

import OoooOOO.o0O00000;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import o0000o0.OooOOOO;
import o0000ooO.o0O0OOO0;
import o000O.OooO00o;
import o000OOo0.OooO0O0;
import o000OOo0.OooO0OO;
import o000Oo00.OooOOO;
import o00OoO00.OooOOO0;

/* loaded from: classes2.dex */
public final class o0OOO0o implements o00Ooo, OooO00o {

    /* renamed from: OooOoo, reason: collision with root package name */
    public static final o0ooOOo f29679OooOoo = new o0ooOOo(0);

    /* renamed from: OooOo, reason: collision with root package name */
    public final HashMap f29680OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final HashMap f29681OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final HashMap f29682OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final o000OOo f29683OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final HashSet f29684OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final AtomicReference f29685OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final o0O00000 f29686OooOoo0;

    public o0OOO0o(ArrayList arrayList, ArrayList arrayList2, o0O00000 o0o00000) {
        o0O0OOO0 o0o0ooo0 = o0O0OOO0.f29724OooOo0O;
        this.f29681OooOo0O = new HashMap();
        this.f29682OooOo0o = new HashMap();
        this.f29680OooOo = new HashMap();
        this.f29684OooOoO0 = new HashSet();
        this.f29685OooOoOO = new AtomicReference();
        o000OOo o000ooo2 = new o000OOo();
        this.f29683OooOoO = o000ooo2;
        this.f29686OooOoo0 = o0o00000;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(o00Oo0.OooO0OO(o000ooo2, o000OOo.class, OooO0OO.class, OooO0O0.class));
        int i = 0;
        arrayList3.add(o00Oo0.OooO0OO(this, OooO00o.class, new Class[0]));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            o00Oo0 o00oo0 = (o00Oo0) obj;
            if (o00oo0 != null) {
                arrayList3.add(o00oo0);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((OooOOO) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f29686OooOoo0.OooOO0O(componentRegistrar));
                        it.remove();
                    }
                } catch (o000000 e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((o00Oo0) it2.next()).f29671OooO0O0.toArray();
                int length = array.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        Object obj3 = array[i4];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f29684OooOoO0.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f29684OooOoO0.add(obj3.toString());
                        }
                        i4++;
                    }
                }
            }
            if (this.f29681OooOo0O.isEmpty()) {
                o00Oo0oo.o00oO0o.OooO0o(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f29681OooOo0O.keySet());
                arrayList6.addAll(arrayList3);
                o00Oo0oo.o00oO0o.OooO0o(arrayList6);
            }
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj4 = arrayList3.get(i5);
                i5++;
                o00Oo0 o00oo02 = (o00Oo0) obj4;
                this.f29681OooOo0O.put(o00oo02, new o000000O(new OooOOOO(1, this, o00oo02)));
            }
            arrayList5.addAll(OooO(arrayList3));
            arrayList5.addAll(OooOO0());
            OooO0oo();
        }
        int size4 = arrayList5.size();
        while (i < size4) {
            Object obj5 = arrayList5.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f29685OooOoOO.get();
        if (bool != null) {
            OooO0oO(this.f29681OooOo0O, bool.booleanValue());
        }
    }

    public final ArrayList OooO(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o00Oo0 o00oo0 = (o00Oo0) obj;
            if (o00oo0.f29675OooO0o0 == 0) {
                OooOOO oooOOO = (OooOOO) this.f29681OooOo0O.get(o00oo0);
                for (o00000OO o00000oo2 : o00oo0.f29671OooO0O0) {
                    HashMap map = this.f29682OooOo0o;
                    if (map.containsKey(o00000oo2)) {
                        arrayList2.add(new io.flutter.plugins.webviewflutter.OooOOOO(1, (o00000O0) ((OooOOO) map.get(o00000oo2)), oooOOO));
                    } else {
                        map.put(o00000oo2, oooOOO);
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // o0000oo0.o00Ooo
    public final synchronized OooOOO OooO0O0(o00000OO o00000oo2) {
        OooOOO0.OooO0o0(o00000oo2, "Null interface requested.");
        return (OooOOO) this.f29682OooOo0o.get(o00000oo2);
    }

    @Override // o0000oo0.o00Ooo
    public final synchronized OooOOO OooO0OO(o00000OO o00000oo2) {
        o00000 o00000Var = (o00000) this.f29680OooOo.get(o00000oo2);
        if (o00000Var != null) {
            return o00000Var;
        }
        return f29679OooOoo;
    }

    @Override // o0000oo0.o00Ooo
    public final o00000O0 OooO0Oo(o00000OO o00000oo2) {
        OooOOO oooOOOOooO0O0 = OooO0O0(o00000oo2);
        return oooOOOOooO0O0 == null ? new o00000O0(o00000O0.f29660OooO0OO, o00000O0.f29661OooO0Oo) : oooOOOOooO0O0 instanceof o00000O0 ? (o00000O0) oooOOOOooO0O0 : new o00000O0(null, oooOOOOooO0O0);
    }

    public final void OooO0oO(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            o00Oo0 o00oo0 = (o00Oo0) entry.getKey();
            OooOOO oooOOO = (OooOOO) entry.getValue();
            int i = o00oo0.f29673OooO0Oo;
            if (i == 1 || (i == 2 && z)) {
                oooOOO.get();
            }
        }
        o000OOo o000ooo2 = this.f29683OooOoO;
        synchronized (o000ooo2) {
            arrayDeque = o000ooo2.f29669OooO0O0;
            if (arrayDeque != null) {
                o000ooo2.f29669OooO0O0 = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                o000ooo2.OooO00o((o000OOo0.OooO00o) it.next());
            }
        }
    }

    public final void OooO0oo() {
        for (o00Oo0 o00oo0 : this.f29681OooOo0O.keySet()) {
            for (oo0o0Oo oo0o0oo : o00oo0.f29672OooO0OO) {
                boolean z = oo0o0oo.f29694OooO0O0 == 2;
                o00000OO o00000oo2 = oo0o0oo.f29693OooO00o;
                if (z) {
                    HashMap map = this.f29680OooOo;
                    if (!map.containsKey(o00000oo2)) {
                        Set set = Collections.EMPTY_SET;
                        o00000 o00000Var = new o00000();
                        o00000Var.f29656OooO0O0 = null;
                        o00000Var.f29655OooO00o = Collections.newSetFromMap(new ConcurrentHashMap());
                        o00000Var.f29655OooO00o.addAll(set);
                        map.put(o00000oo2, o00000Var);
                    }
                }
                HashMap map2 = this.f29682OooOo0o;
                if (map2.containsKey(o00000oo2)) {
                    continue;
                } else {
                    int i = oo0o0oo.f29694OooO0O0;
                    if (i == 1) {
                        throw new o0O0O00("Unsatisfied dependency for component " + o00oo0 + ": " + o00000oo2);
                    }
                    if (i != 2) {
                        map2.put(o00000oo2, new o00000O0(o00000O0.f29660OooO0OO, o00000O0.f29661OooO0Oo));
                    }
                }
            }
        }
    }

    public final ArrayList OooOO0() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f29681OooOo0O.entrySet()) {
            o00Oo0 o00oo0 = (o00Oo0) entry.getKey();
            if (o00oo0.f29675OooO0o0 != 0) {
                OooOOO oooOOO = (OooOOO) entry.getValue();
                for (o00000OO o00000oo2 : o00oo0.f29671OooO0O0) {
                    if (!map.containsKey(o00000oo2)) {
                        map.put(o00000oo2, new HashSet());
                    }
                    ((Set) map.get(o00000oo2)).add(oooOOO);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f29680OooOo;
            if (map2.containsKey(key)) {
                o00000 o00000Var = (o00000) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new io.flutter.plugins.webviewflutter.OooOOOO(2, o00000Var, (OooOOO) it.next()));
                }
            } else {
                o00000OO o00000oo3 = (o00000OO) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                o00000 o00000Var2 = new o00000();
                o00000Var2.f29656OooO0O0 = null;
                o00000Var2.f29655OooO00o = Collections.newSetFromMap(new ConcurrentHashMap());
                o00000Var2.f29655OooO00o.addAll(set);
                map2.put(o00000oo3, o00000Var2);
            }
        }
        return arrayList;
    }
}
