#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME} #end

import android.content.Context
import android.content.Intent
import android.os.Bundle

import javax.inject.Inject

class ${Name_Base}Activity : BaseActivity(), ${Name_Base}View {

    @Inject
    internal lateinit var mPresenter: ${Name_Base}Presenter
    @Inject
    internal lateinit var mNavigator: ${Name_Base}Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.${Layout_Res_Id})
    }

    override fun onStart() {
        super.onStart()
        mPresenter.onStart()
    }

    override fun onStop() {
        mPresenter.onStop()
        super.onStop()
    }

    override fun onDestroy() {
        mPresenter.onDestroy()
        super.onDestroy()
    }
}
