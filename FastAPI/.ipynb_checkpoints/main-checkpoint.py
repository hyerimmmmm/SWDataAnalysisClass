#!/usr/bin/env python
# coding: utf-8

# anaconda prompt 창을 켜서 -> 해당 파일이 있는 주소로 경로 이동(cd)
# 실행 명령어 uvicorn main:app --reload -> 파일이 변경 될때마다 재실행

# # 필요한 라이브러리 설치
# - fastapi: python쪽에 요청을 처리할 수 있는 서버를 로드하는 라이브러리(flask 라이브러리와 유사)
# - uvicorn: 서버 재요청을 할때마다, 서버를 껐다 켜는게 불편하니까 사용하기 쉬우려고 추가하는 라이브러리

# In[4]:


# get_ipython().system('pip install fastapi')


# In[11]:


# !pip install uvicorn[standard]
# get_ipython().system('pip install "uvicorn[standard]"')


# In[18]:


# get_ipython().system('pip install nbconvert')


# # FastAPI 사용하기

# In[16]:


# 1. 라이브러리 가져오기(필요한 데이터셋에 따라 라이브러리 추가)
# fastapi 라이브러리
from fastapi import FastAPI
# 동일 출처 정책 설정을 위한 라이브러리
from fastapi.middleware.cors import CORSMiddleware
# 크롤링을 위한 라이브러리
from selenium import webdriver as wb
from selenium.webdriver.common.by import By


# In[ ]:


# 2. FastAPI를 기반으로 한 app 생성
app = FastAPI()

app.add_middleware(
    CORSMiddleware, # 동일출처정책과 관련한 미들웨어
    allow_origins = ["http://localhost:8090"], # 접근을 허용할 출처(==접근을 허용할 url)
    allow_methods = ["*"], # 접근을 허용할 전송 방식
    allow_headers = ["*"], # 접근을 허용할 상태값
    allow_credentials = True
)

# 3. 요청을 처리할 수 있는 url과 함수를 생성
@app.get("/temp") # 요청 url(스프링 부트의 @GetMapping 이랑 비슷하다고 보면 됨)
# # 수집해야 하는 데이터가 있다면, parameter로 받아오면 됨
# # --> parameter의 이름은 보내주는 data의 key값과 일치해야 함
def temp(sendData):
    print("data: " + sendData)
    img_src = crawling(sendData)
    return {"img_src": img_src}

# print(app)

def crawling(sendData):
    driver = wb.Chrome()
    driver.get(f"https://search.naver.com/search.naver?ssc=tab.image.all&where=image&sm=tab_jum&query={sendData}")
    driver.implicitly_wait(5)
    print("데이터: ", sendData)
    
    img = driver.find_element(By.CSS_SELECTOR, "#main_pack > section > div.api_subject_bx._fe_image_tab_grid_root.ani_fadein > div > div > div.image_tile._fe_image_tab_grid > div:nth-child(1) > div > div > div > img")
    img_src = img.get_attribute("src")
    
    driver.quit()
    
    return img_src