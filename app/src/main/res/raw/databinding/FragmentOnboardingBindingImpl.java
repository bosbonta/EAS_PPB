package raw.databinding;
import com.shopping.app.R;
import com.shopping.app.BR;
import com.shopping.app.databinding.FragmentOnboardingBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOnboardingBindingImpl extends FragmentOnboardingBinding implements com.shopping.app.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewPagerOnboard, 4);
        sViewsWithIds.put(R.id.indicatorsContainer, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOnboardingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentOnboardingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[2]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (androidx.viewpager2.widget.ViewPager2) bindings[4]
            );
        this.btnNext.setTag(null);
        this.btnPrevious.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvSkip.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.shopping.app.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.shopping.app.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.shopping.app.generated.callback.OnClickListener(this, 2);
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
        if (BR.onboardingFragment == variableId) {
            setOnboardingFragment((com.shopping.app.ui.onboarding.OnboardingFragment) variable);
        }
        else if (BR.nextButtonText == variableId) {
            setNextButtonText((java.lang.String) variable);
        }
        else if (BR.prevButtonVisibility == variableId) {
            setPrevButtonVisibility((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOnboardingFragment(@Nullable com.shopping.app.ui.onboarding.OnboardingFragment OnboardingFragment) {
        this.mOnboardingFragment = OnboardingFragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.onboardingFragment);
        super.requestRebind();
    }
    public void setNextButtonText(@Nullable java.lang.String NextButtonText) {
        this.mNextButtonText = NextButtonText;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.nextButtonText);
        super.requestRebind();
    }
    public void setPrevButtonVisibility(@Nullable java.lang.Boolean PrevButtonVisibility) {
        this.mPrevButtonVisibility = PrevButtonVisibility;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.prevButtonVisibility);
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
        boolean androidxDatabindingViewDataBindingSafeUnboxPrevButtonVisibility = false;
        com.shopping.app.ui.onboarding.OnboardingFragment onboardingFragment = mOnboardingFragment;
        java.lang.String nextButtonText = mNextButtonText;
        int prevButtonVisibilityViewVISIBLEViewINVISIBLE = 0;
        java.lang.Boolean prevButtonVisibility = mPrevButtonVisibility;

        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(prevButtonVisibility)
                androidxDatabindingViewDataBindingSafeUnboxPrevButtonVisibility = androidx.databinding.ViewDataBinding.safeUnbox(prevButtonVisibility);
            if((dirtyFlags & 0xcL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxPrevButtonVisibility) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(prevButtonVisibility) ? View.VISIBLE : View.INVISIBLE
                prevButtonVisibilityViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxPrevButtonVisibility) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnNext, nextButtonText);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnNext.setOnClickListener(mCallback3);
            this.btnPrevious.setOnClickListener(mCallback2);
            this.tvSkip.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.btnPrevious.setVisibility(prevButtonVisibilityViewVISIBLEViewINVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // onboardingFragment
                com.shopping.app.ui.onboarding.OnboardingFragment onboardingFragment = mOnboardingFragment;
                // onboardingFragment != null
                boolean onboardingFragmentJavaLangObjectNull = false;



                onboardingFragmentJavaLangObjectNull = (onboardingFragment) != (null);
                if (onboardingFragmentJavaLangObjectNull) {


                    onboardingFragment.nextClickListener();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // onboardingFragment
                com.shopping.app.ui.onboarding.OnboardingFragment onboardingFragment = mOnboardingFragment;
                // onboardingFragment != null
                boolean onboardingFragmentJavaLangObjectNull = false;



                onboardingFragmentJavaLangObjectNull = (onboardingFragment) != (null);
                if (onboardingFragmentJavaLangObjectNull) {


                    onboardingFragment.nextScreen();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // onboardingFragment
                com.shopping.app.ui.onboarding.OnboardingFragment onboardingFragment = mOnboardingFragment;
                // onboardingFragment != null
                boolean onboardingFragmentJavaLangObjectNull = false;



                onboardingFragmentJavaLangObjectNull = (onboardingFragment) != (null);
                if (onboardingFragmentJavaLangObjectNull) {


                    onboardingFragment.prevClickListener();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): onboardingFragment
        flag 1 (0x2L): nextButtonText
        flag 2 (0x3L): prevButtonVisibility
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(prevButtonVisibility) ? View.VISIBLE : View.INVISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(prevButtonVisibility) ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}