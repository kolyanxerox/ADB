package androidx.appcompat.view;

import OooO0oO.OooOo;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.C0038R;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class SupportMenuInflater extends MenuInflater {
    static final Class<?>[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
    static final Class<?>[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    static final String LOG_TAG = "SupportMenuInflater";
    static final int NO_ID = 0;
    private static final String XML_GROUP = "group";
    private static final String XML_ITEM = "item";
    private static final String XML_MENU = "menu";
    final Object[] mActionProviderConstructorArguments;
    final Object[] mActionViewConstructorArguments;
    Context mContext;
    private Object mRealOwner;

    public static class InflatedOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] PARAM_TYPES = {MenuItem.class};
        private Method mMethod;
        private Object mRealOwner;

        public InflatedOnMenuItemClickListener(Object obj, String str) {
            this.mRealOwner = obj;
            Class<?> cls = obj.getClass();
            try {
                this.mMethod = cls.getMethod(str, PARAM_TYPES);
            } catch (Exception e) {
                StringBuilder sbOooOoO0 = OooOo.OooOoO0("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbOooOoO0.append(cls.getName());
                InflateException inflateException = new InflateException(sbOooOoO0.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                if (this.mMethod.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.mMethod.invoke(this.mRealOwner, menuItem)).booleanValue();
                }
                this.mMethod.invoke(this.mRealOwner, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public class MenuState {
        private static final int defaultGroupId = 0;
        private static final int defaultItemCategory = 0;
        private static final int defaultItemCheckable = 0;
        private static final boolean defaultItemChecked = false;
        private static final boolean defaultItemEnabled = true;
        private static final int defaultItemId = 0;
        private static final int defaultItemOrder = 0;
        private static final boolean defaultItemVisible = true;
        private int groupCategory;
        private int groupCheckable;
        private boolean groupEnabled;
        private int groupId;
        private int groupOrder;
        private boolean groupVisible;
        ActionProvider itemActionProvider;
        private String itemActionProviderClassName;
        private String itemActionViewClassName;
        private int itemActionViewLayout;
        private boolean itemAdded;
        private int itemAlphabeticModifiers;
        private char itemAlphabeticShortcut;
        private int itemCategoryOrder;
        private int itemCheckable;
        private boolean itemChecked;
        private CharSequence itemContentDescription;
        private boolean itemEnabled;
        private int itemIconResId;
        private ColorStateList itemIconTintList = null;
        private PorterDuff.Mode itemIconTintMode = null;
        private int itemId;
        private String itemListenerMethodName;
        private int itemNumericModifiers;
        private char itemNumericShortcut;
        private int itemShowAsAction;
        private CharSequence itemTitle;
        private CharSequence itemTitleCondensed;
        private CharSequence itemTooltipText;
        private boolean itemVisible;
        private Menu menu;

        public MenuState(Menu menu) {
            this.menu = menu;
            resetGroup();
        }

        private char getShortcut(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T newInstance(String str, Class<?>[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, SupportMenuInflater.this.mContext.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w(SupportMenuInflater.LOG_TAG, "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        private void setItem(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.itemChecked).setVisible(this.itemVisible).setEnabled(this.itemEnabled).setCheckable(this.itemCheckable >= 1).setTitleCondensed(this.itemTitleCondensed).setIcon(this.itemIconResId);
            int i = this.itemShowAsAction;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.itemListenerMethodName != null) {
                if (SupportMenuInflater.this.mContext.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new InflatedOnMenuItemClickListener(SupportMenuInflater.this.getRealOwner(), this.itemListenerMethodName));
            }
            if (this.itemCheckable >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).setExclusiveCheckable(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).setExclusiveCheckable(true);
                }
            }
            String str = this.itemActionViewClassName;
            if (str != null) {
                menuItem.setActionView((View) newInstance(str, SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, SupportMenuInflater.this.mActionViewConstructorArguments));
                z = true;
            }
            int i2 = this.itemActionViewLayout;
            if (i2 > 0) {
                if (z) {
                    Log.w(SupportMenuInflater.LOG_TAG, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            ActionProvider actionProvider = this.itemActionProvider;
            if (actionProvider != null) {
                MenuItemCompat.setActionProvider(menuItem, actionProvider);
            }
            MenuItemCompat.setContentDescription(menuItem, this.itemContentDescription);
            MenuItemCompat.setTooltipText(menuItem, this.itemTooltipText);
            MenuItemCompat.setAlphabeticShortcut(menuItem, this.itemAlphabeticShortcut, this.itemAlphabeticModifiers);
            MenuItemCompat.setNumericShortcut(menuItem, this.itemNumericShortcut, this.itemNumericModifiers);
            PorterDuff.Mode mode = this.itemIconTintMode;
            if (mode != null) {
                MenuItemCompat.setIconTintMode(menuItem, mode);
            }
            ColorStateList colorStateList = this.itemIconTintList;
            if (colorStateList != null) {
                MenuItemCompat.setIconTintList(menuItem, colorStateList);
            }
        }

        public void addItem() {
            this.itemAdded = true;
            setItem(this.menu.add(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle));
        }

        public SubMenu addSubMenuItem() {
            this.itemAdded = true;
            SubMenu subMenuAddSubMenu = this.menu.addSubMenu(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle);
            setItem(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean hasAddedItem() {
            return this.itemAdded;
        }

        public void readGroup(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = SupportMenuInflater.this.mContext.obtainStyledAttributes(attributeSet, C0038R.styleable.MenuGroup);
            this.groupId = typedArrayObtainStyledAttributes.getResourceId(C0038R.styleable.MenuGroup_android_id, 0);
            this.groupCategory = typedArrayObtainStyledAttributes.getInt(C0038R.styleable.MenuGroup_android_menuCategory, 0);
            this.groupOrder = typedArrayObtainStyledAttributes.getInt(C0038R.styleable.MenuGroup_android_orderInCategory, 0);
            this.groupCheckable = typedArrayObtainStyledAttributes.getInt(C0038R.styleable.MenuGroup_android_checkableBehavior, 0);
            this.groupVisible = typedArrayObtainStyledAttributes.getBoolean(C0038R.styleable.MenuGroup_android_visible, true);
            this.groupEnabled = typedArrayObtainStyledAttributes.getBoolean(C0038R.styleable.MenuGroup_android_enabled, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void readItem(AttributeSet attributeSet) {
            TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(SupportMenuInflater.this.mContext, attributeSet, C0038R.styleable.MenuItem);
            this.itemId = tintTypedArrayObtainStyledAttributes.getResourceId(C0038R.styleable.MenuItem_android_id, 0);
            this.itemCategoryOrder = (tintTypedArrayObtainStyledAttributes.getInt(C0038R.styleable.MenuItem_android_menuCategory, this.groupCategory) & SupportMenu.CATEGORY_MASK) | (tintTypedArrayObtainStyledAttributes.getInt(C0038R.styleable.MenuItem_android_orderInCategory, this.groupOrder) & 65535);
            this.itemTitle = tintTypedArrayObtainStyledAttributes.getText(C0038R.styleable.MenuItem_android_title);
            this.itemTitleCondensed = tintTypedArrayObtainStyledAttributes.getText(C0038R.styleable.MenuItem_android_titleCondensed);
            this.itemIconResId = tintTypedArrayObtainStyledAttributes.getResourceId(C0038R.styleable.MenuItem_android_icon, 0);
            this.itemAlphabeticShortcut = getShortcut(tintTypedArrayObtainStyledAttributes.getString(C0038R.styleable.MenuItem_android_alphabeticShortcut));
            this.itemAlphabeticModifiers = tintTypedArrayObtainStyledAttributes.getInt(C0038R.styleable.MenuItem_alphabeticModifiers, 4096);
            this.itemNumericShortcut = getShortcut(tintTypedArrayObtainStyledAttributes.getString(C0038R.styleable.MenuItem_android_numericShortcut));
            this.itemNumericModifiers = tintTypedArrayObtainStyledAttributes.getInt(C0038R.styleable.MenuItem_numericModifiers, 4096);
            if (tintTypedArrayObtainStyledAttributes.hasValue(C0038R.styleable.MenuItem_android_checkable)) {
                this.itemCheckable = tintTypedArrayObtainStyledAttributes.getBoolean(C0038R.styleable.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.itemCheckable = this.groupCheckable;
            }
            this.itemChecked = tintTypedArrayObtainStyledAttributes.getBoolean(C0038R.styleable.MenuItem_android_checked, false);
            this.itemVisible = tintTypedArrayObtainStyledAttributes.getBoolean(C0038R.styleable.MenuItem_android_visible, this.groupVisible);
            this.itemEnabled = tintTypedArrayObtainStyledAttributes.getBoolean(C0038R.styleable.MenuItem_android_enabled, this.groupEnabled);
            this.itemShowAsAction = tintTypedArrayObtainStyledAttributes.getInt(C0038R.styleable.MenuItem_showAsAction, -1);
            this.itemListenerMethodName = tintTypedArrayObtainStyledAttributes.getString(C0038R.styleable.MenuItem_android_onClick);
            this.itemActionViewLayout = tintTypedArrayObtainStyledAttributes.getResourceId(C0038R.styleable.MenuItem_actionLayout, 0);
            this.itemActionViewClassName = tintTypedArrayObtainStyledAttributes.getString(C0038R.styleable.MenuItem_actionViewClass);
            String string = tintTypedArrayObtainStyledAttributes.getString(C0038R.styleable.MenuItem_actionProviderClass);
            this.itemActionProviderClassName = string;
            boolean z = string != null;
            if (z && this.itemActionViewLayout == 0 && this.itemActionViewClassName == null) {
                this.itemActionProvider = (ActionProvider) newInstance(string, SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE, SupportMenuInflater.this.mActionProviderConstructorArguments);
            } else {
                if (z) {
                    Log.w(SupportMenuInflater.LOG_TAG, "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.itemActionProvider = null;
            }
            this.itemContentDescription = tintTypedArrayObtainStyledAttributes.getText(C0038R.styleable.MenuItem_contentDescription);
            this.itemTooltipText = tintTypedArrayObtainStyledAttributes.getText(C0038R.styleable.MenuItem_tooltipText);
            if (tintTypedArrayObtainStyledAttributes.hasValue(C0038R.styleable.MenuItem_iconTintMode)) {
                this.itemIconTintMode = DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(C0038R.styleable.MenuItem_iconTintMode, -1), this.itemIconTintMode);
            } else {
                this.itemIconTintMode = null;
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(C0038R.styleable.MenuItem_iconTint)) {
                this.itemIconTintList = tintTypedArrayObtainStyledAttributes.getColorStateList(C0038R.styleable.MenuItem_iconTint);
            } else {
                this.itemIconTintList = null;
            }
            tintTypedArrayObtainStyledAttributes.recycle();
            this.itemAdded = false;
        }

        public void resetGroup() {
            this.groupId = 0;
            this.groupCategory = 0;
            this.groupOrder = 0;
            this.groupCheckable = 0;
            this.groupVisible = true;
            this.groupEnabled = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        ACTION_VIEW_CONSTRUCTOR_SIGNATURE = clsArr;
        ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = clsArr;
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.mContext = context;
        Object[] objArr = {context};
        this.mActionViewConstructorArguments = objArr;
        this.mActionProviderConstructorArguments = objArr;
    }

    private Object findRealOwner(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? findRealOwner(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0057, code lost:
    
        if (r15.equals(androidx.appcompat.view.SupportMenuInflater.XML_GROUP) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0059, code lost:
    
        r0.resetGroup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0061, code lost:
    
        if (r15.equals(androidx.appcompat.view.SupportMenuInflater.XML_ITEM) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0067, code lost:
    
        if (r0.hasAddedItem() != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0069, code lost:
    
        r15 = r0.itemActionProvider;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x006b, code lost:
    
        if (r15 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0071, code lost:
    
        if (r15.hasSubMenu() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0073, code lost:
    
        r0.addSubMenuItem();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0077, code lost:
    
        r0.addItem();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x007f, code lost:
    
        if (r15.equals(androidx.appcompat.view.SupportMenuInflater.XML_MENU) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0081, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0083, code lost:
    
        if (r7 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0086, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x008e, code lost:
    
        if (r15.equals(androidx.appcompat.view.SupportMenuInflater.XML_GROUP) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0090, code lost:
    
        r0.readGroup(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0098, code lost:
    
        if (r15.equals(androidx.appcompat.view.SupportMenuInflater.XML_ITEM) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x009a, code lost:
    
        r0.readItem(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00a2, code lost:
    
        if (r15.equals(androidx.appcompat.view.SupportMenuInflater.XML_MENU) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00a4, code lost:
    
        parseMenu(r13, r14, r0.addSubMenuItem());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00ac, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00ae, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00ba, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00bb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0030, code lost:
    
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0035, code lost:
    
        if (r6 != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0037, code lost:
    
        if (r15 == 1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x003d, code lost:
    
        if (r15 == 2) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0040, code lost:
    
        if (r15 == 3) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0044, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0048, code lost:
    
        if (r7 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x004e, code lost:
    
        if (r15.equals(r8) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0050, code lost:
    
        r7 = false;
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void parseMenu(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r12 = this;
            androidx.appcompat.view.SupportMenuInflater$MenuState r0 = new androidx.appcompat.view.SupportMenuInflater$MenuState
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L2a
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L30
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Expecting menu, got "
            java.lang.String r14 = r14.concat(r15)
            r13.<init>(r14)
            throw r13
        L2a:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L30:
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r5
        L35:
            if (r6 != 0) goto Lbb
            if (r15 == r3) goto Lb3
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L83
            r11 = 3
            if (r15 == r11) goto L44
            goto Lae
        L44:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L53
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L53
            r7 = r4
            r8 = r5
            goto Lae
        L53:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L5d
            r0.resetGroup()
            goto Lae
        L5d:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L7b
            boolean r15 = r0.hasAddedItem()
            if (r15 != 0) goto Lae
            androidx.core.view.ActionProvider r15 = r0.itemActionProvider
            if (r15 == 0) goto L77
            boolean r15 = r15.hasSubMenu()
            if (r15 == 0) goto L77
            r0.addSubMenuItem()
            goto Lae
        L77:
            r0.addItem()
            goto Lae
        L7b:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lae
            r6 = r3
            goto Lae
        L83:
            if (r7 == 0) goto L86
            goto Lae
        L86:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L94
            r0.readGroup(r14)
            goto Lae
        L94:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L9e
            r0.readItem(r14)
            goto Lae
        L9e:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lac
            android.view.SubMenu r15 = r0.addSubMenuItem()
            r12.parseMenu(r13, r14, r15)
            goto Lae
        Lac:
            r8 = r15
            r7 = r3
        Lae:
            int r15 = r13.next()
            goto L35
        Lb3:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.SupportMenuInflater.parseMenu(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    public Object getRealOwner() {
        if (this.mRealOwner == null) {
            this.mRealOwner = findRealOwner(this.mContext);
        }
        return this.mRealOwner;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.mContext.getResources().getLayout(i);
                    parseMenu(layout, Xml.asAttributeSet(layout), menu);
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}
