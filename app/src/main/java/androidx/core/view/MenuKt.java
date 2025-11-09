package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import o00O0Oo.o00O0O;

/* loaded from: classes.dex */
public final class MenuKt {

    /* renamed from: androidx.core.view.MenuKt$iterator$1 */
    public static final class C02521 implements Iterator<MenuItem>, o00O0OoO.OooO0OO {
        final /* synthetic */ Menu $this_iterator;
        private int index;

        public C02521(Menu menu) {
            this.$this_iterator = menu;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            oo00o.OooOo oooOo;
            Menu menu = this.$this_iterator;
            int i = this.index - 1;
            this.index = i;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                menu.removeItem(item.getItemId());
                oooOo = oo00o.OooOo.f33195OooO00o;
            } else {
                oooOo = null;
            }
            if (oooOo == null) {
                throw new IndexOutOfBoundsException();
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public MenuItem next() {
            Menu menu = this.$this_iterator;
            int i = this.index;
            this.index = i + 1;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public static final boolean contains(Menu menu, MenuItem menuItem) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (kotlin.jvm.internal.OooOo.OooO00o(menu.getItem(i), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(Menu menu, o00O0Oo.Oooo000 oooo000) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            oooo000.invoke(menu.getItem(i));
        }
    }

    public static final void forEachIndexed(Menu menu, o00O0O o00o0o) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            o00o0o.invoke(Integer.valueOf(i), menu.getItem(i));
        }
    }

    public static final MenuItem get(Menu menu, int i) {
        return menu.getItem(i);
    }

    public static final o00O0o.Oooo000 getChildren(final Menu menu) {
        return new o00O0o.Oooo000() { // from class: androidx.core.view.MenuKt$children$1
            @Override // o00O0o.Oooo000
            public Iterator<MenuItem> iterator() {
                return MenuKt.iterator(menu);
            }
        };
    }

    public static final int getSize(Menu menu) {
        return menu.size();
    }

    public static final boolean isEmpty(Menu menu) {
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(Menu menu) {
        return menu.size() != 0;
    }

    public static final Iterator<MenuItem> iterator(Menu menu) {
        return new C02521(menu);
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(Menu menu, int i) {
        oo00o.OooOo oooOo;
        MenuItem item = menu.getItem(i);
        if (item != null) {
            menu.removeItem(item.getItemId());
            oooOo = oo00o.OooOo.f33195OooO00o;
        } else {
            oooOo = null;
        }
        if (oooOo == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
