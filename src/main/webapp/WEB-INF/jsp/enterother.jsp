<div class="col-8" style="height: 300px;border: 1px solid #ccc;">
                <div class="row">
                    <div class="col-2">
                        <img class="logo-bank" src="<%=request.getContextPath()%>/resources/img/logo.png">
                    </div>
                    <div class="col-8 justify-content-center text-center">
                        <span style="font-size: 40px;">
                            <b>HLD BANK @ATM</b>
                        </span><br><span id="title"></span>
                    </div>
                    <div class="offset-2"></div>
                </div>
                <div class="row">
                    <div class="offset-3"></div>
                    <div class="col-6" align="center">
                        <!-- <p class="dialog-erro" style="margin-left:293px "><b>Your enter a WRONG PIN</b></p> -->
                        <h6 style="margin-top: 35px;" align="center">Enter your amount want to withdraw below, number you enter have to diviable to 50.000</h6>
                        <input type="text" class="pin-change" maxlength="8" disabled  id="amount">
                        <input type="hidden"   id="amountvalue">
                        <!-- <p style="font-size: 12px"><b>then press Enter Button</b></p> -->
                    </div>
                    <div class="col-3">
                        <button type="button" class="btn btn-outline-primary disabled z" style="opacity: 0">1.000.000</button>
                        <button type="button" class="btn btn-outline-primary disabled z ">OK</button>
                        <button type="button" class="btn btn-outline-primary disabled z ">CANCEL</button>
                    </div>
                </div>
            </div>