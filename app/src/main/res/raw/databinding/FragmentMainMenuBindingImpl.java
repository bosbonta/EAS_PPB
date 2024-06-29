package raw.databinding;
import com.shopping.app.R;
import com.shopping.app.BR;
import com.shopping.app.databinding.FragmentMainMenuBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainMenuBindingImpl extends FragmentMainMenuBinding implements com.shopping.app.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbarMain, 4);
        sViewsWithIds.put(R.id.dividerMain, 5);
        sViewsWithIds.put(R.id.navHostFragmentContainer, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentMainMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.bottomnavigation.BottomNavigationView) bindings[3]
            , (android.view.View) bindings[5]
            , (android.widget.LinearLayout) bindings[1]
            , (androidx.fragment.app.FragmentContainerView) bindings[6]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.bottomNav.setTag(null);
        this.llBasket.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvTotal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.shopping.app.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.isBottomNavVisible == variableId) {
            setIsBottomNavVisible((java.lang.Boolean) variable);
        }
        else if (BR.mainMenuFragment == variableId) {
            setMainMenuFragment((com.shopping.app.ui.main.mainbase.MainMenuFragment) variable);
        }
        else if (BR.total == variableId) {
            setTotal((java.lang.Double) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsBottomNavVisible(@Nullable java.lang.Boolean IsBottomNavVisible) {
        this.mIsBottomNavVisible = IsBottomNavVisible;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isBottomNavVisible);
        super.requestRebind();
    }
    public void setMainMenuFragment(@Nullable com.shopping.app.ui.main.mainbase.MainMenuFragment MainMenuFragment) {
        this.mMainMenuFragment = MainMenuFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.mainMenuFragment);
        super.requestRebind();
    }
    public void setTotal(@Nullable java.lang.Double Total) {
        this.mTotal = Total;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.total);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.Boolean isBottomNavVisible = mIsBottomNavVisible;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsBottomNavVisible = false;
        com.shopping.app.ui.main.mainbase.MainMenuFragment mainMenuFragment = mMainMenuFragment;
        java.lang.Double total = mTotal;
        int isBottomNavVisibleViewVISIBLEViewGONE = 0;
        java.lang.String tvTotalAndroidStringCurrencyUnitTotal = null;

        if ((dirtyFlags & 0x9L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isBottomNavVisible)
                androidxDatabindingViewDataBindingSafeUnboxIsBottomNavVisible = androidx.databinding.ViewDataBinding.safeUnbox(isBottomNavVisible);
            if((dirtyFlags & 0x9L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsBottomNavVisible) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isBottomNavVisible) ? View.VISIBLE : View.GONE
                isBottomNavVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsBottomNavVisible) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read @android:string/currency_unit
                tvTotalAndroidStringCurrencyUnitTotal = tvTotal.getResources().getString(R.string.currency_unit, total);
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.bottomNav.setVisibility(isBottomNavVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.llBasket.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotal, tvTotalAndroidStringCurrencyUnitTotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // mainMenuFragment
        com.shopping.app.ui.main.mainbase.MainMenuFragment mainMenuFragment = mMainMenuFragment;
        // mainMenuFragment != null
        boolean mainMenuFragmentJavaLangObjectNull = false;



        mainMenuFragmentJavaLangObjectNull = (mainMenuFragment) != (null);
        if (mainMenuFragmentJavaLangObjectNull) {


            mainMenuFragment.openBasket();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isBottomNavVisible
        flag 1 (0x2L): mainMenuFragment
        flag 2 (0x3L): total
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(isBottomNavVisible) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(isBottomNavVisible) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}